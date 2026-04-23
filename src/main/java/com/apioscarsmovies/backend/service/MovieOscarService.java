package com.apioscarsmovies.backend.service;

import com.apioscarsmovies.backend.model.MovieOscar;
import com.apioscarsmovies.backend.repository.MovieOscarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieOscarService {

    @Autowired
    private MovieOscarRepository movieOscarRepository;

    // Obtener todas las peliculas
    public List<MovieOscar> getAllMovies() {
        return movieOscarRepository.findAll();
    }

    // Obtener pelicula por ID
    public Optional<MovieOscar> getMovieById(String id) {
        return movieOscarRepository.findById(id);
    }

    // Crear nueva pelicula
    public MovieOscar createMovie(MovieOscar movie) {
        return movieOscarRepository.save(movie);
    }

    // Actualizar pelicula existente
    public MovieOscar updateMovie(String id, MovieOscar movieUpdated) {
        return movieOscarRepository.findById(id)
                .map(movie -> {
                    movie.setTitleMovie(movieUpdated.getTitleMovie());
                    movie.setDirectorMovie(movieUpdated.getDirectorMovie());
                    movie.setYearMovie(movieUpdated.getYearMovie());
                    movie.setDurationMovie(movieUpdated.getDurationMovie());
                    movie.setActressMovie(movieUpdated.getActressMovie());
                    movie.setActorMovie(movieUpdated.getActorMovie());
                    movie.setPosterUrlMovie(movieUpdated.getPosterUrlMovie());

                    return movieOscarRepository.save(movie);
                })
                .orElseThrow(() -> new RuntimeException("Movie not found with that ID: " + id));
    }

    // Elminar Pelicula
    public void deleteMovie(String id) {
        movieOscarRepository.deleteById(id);
    }

    // Busquedas especificas para el front
    public List<MovieOscar> findByTitleMovie(String title) {
        return movieOscarRepository.findByTitleMovieContainingIgnoreCase(title);
    }

    public List<MovieOscar> findByDirectorMovie(String director) {
        return movieOscarRepository.findByDirectorMovie(director);
    }

    public List<MovieOscar> findByYearMovie(Integer year) {
        return movieOscarRepository.findByYearMovie(year);
    }

    public List<MovieOscar> findByActressMovie(String actress) {
        return movieOscarRepository.findByActressMovie(actress);
    }

    public List<MovieOscar> findByActorMovie(String actor) {
        return movieOscarRepository.findByActorMovie(actor);
    }

    // Estadisticas Utiles
    public long countMovies() {
        return movieOscarRepository.count();
    }

    public List<MovieOscar> getRecentMovies() {
        return movieOscarRepository.findAllByOrderByYearMovieDesc();
    }

    // Busca peliculas entres dos años especificos
    public List<MovieOscar> findByYearMovieBetween(Integer startYear, Integer endYear) {
        //validaciones de parametros
        if (startYear == null || endYear == null) {
            throw new IllegalArgumentException("Los anios de inicio y fin son requeridos, están faltando");
        }
        if (startYear > endYear) {
            throw new IllegalArgumentException("El anio de ininio debe ser menor o igual al anio de fin");
        }

        return movieOscarRepository.findByYearMovieBetween(startYear, endYear);
    }

    // Busca peliculas por titulo de forma personalizada o con exprexiones regulares
    public List<MovieOscar> findByTitleMoviePersonalized(String title) {
        // Validar que el titulo no sea nulo o vacio
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo es requerido, no puede estar vacio o nulo");
        }
        // Opcional limpiar o formatear el titulo antes de buscar
        String titleSearch = title.trim();

        return movieOscarRepository.findByTitleMoviePersonalized(title);
    }
}

