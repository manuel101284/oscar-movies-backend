package com.apioscarsmovies.backend.controller;

import com.apioscarsmovies.backend.model.MovieOscar;
import com.apioscarsmovies.backend.service.MovieOscarService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies-oscar")
@CrossOrigin(origins = "http://localhost:4200") // Para Angular

public class MovieOscarController {
    @Autowired
    private MovieOscarService movieOscarService;

    // Obtener todas las peliculas
    @GetMapping
    public ResponseEntity<List<MovieOscar>> getAllMovies() {
        List<MovieOscar> movies = movieOscarService.getAllMovies();

        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(movies);
    }

    // Obtener pelicula por ID
    @GetMapping("/{id}")
    public Optional<MovieOscar> getMovieById(@PathVariable String id) {
        return movieOscarService.getMovieById(id);
    }

    // Crear Nueva Pelicula (POST)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieOscar createMovie(@RequestBody MovieOscar movie) {
        return movieOscarService.createMovie(movie);
    }

    // Actualizar pelicula existente
    @PutMapping("/{id}")
    public ResponseEntity<MovieOscar> updateMovie(
            @PathVariable String id,
            @RequestBody MovieOscar movie) {
        try {
            MovieOscar updatedMovie = movieOscarService.updateMovie(id, movie);
            return ResponseEntity.ok(updatedMovie);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar pelicula (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable String id) {
        try {
            movieOscarService.deleteMovie(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // End Points de busqueda para el frotend
    @GetMapping("/search/title")
    public ResponseEntity<List<MovieOscar>> searchByTitle(@RequestParam String title) {
        List<MovieOscar> movies = movieOscarService.findByTitleMovie(title);

        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/search/director")
    public ResponseEntity<List<MovieOscar>> searchByDirectorMovie(@RequestParam String director) {
        List<MovieOscar> movies = movieOscarService.findByDirectorMovie(director);

        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(movies);
    }

    @GetMapping("/search/year")
    public ResponseEntity<List<MovieOscar>> searchByYearMovie(@RequestParam Integer year) {
        List<MovieOscar> movies = movieOscarService.findByYearMovie(year);

        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(movies);
    }

    @GetMapping("/search/actress")
    public ResponseEntity<List<MovieOscar>> searchByActressMovie(@RequestParam String actress) {
        List<MovieOscar> movies = movieOscarService.findByActressMovie(actress);

        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(movies);
    }

    @GetMapping("/search/actor")
    public ResponseEntity<List<MovieOscar>> searchByActorMovie(@RequestParam String actor) {
        List<MovieOscar> movies = movieOscarService.findByActorMovie(actor);

        if (movies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(movies);
    }

    // Busquedas avanzadas
    @GetMapping("/search/year-range")
    public ResponseEntity<?> searchByYearRange(
            @RequestParam Integer startYear,
            @RequestParam Integer endYear) {
        try {
            System.out.println("Buscando rango: " + startYear + " - " + endYear);

            if (startYear == null || endYear == null ) {
                System.out.println("Parámetros nulos");
                return ResponseEntity.badRequest().build();
            }

            List<MovieOscar> movies = movieOscarService.findByYearMovieBetween(startYear, endYear);

            if (movies.isEmpty()) {
                return ResponseEntity.noContent().build();
            }

            System.out.println("Películas encontradas: " + movies.size());
            return ResponseEntity.ok(movies);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/search/title-custom")
    public ResponseEntity<?> searchByTitleCustom(@RequestParam String title) {
        try {
            List<MovieOscar> movies = movieOscarService.findByTitleMoviePersonalized(title);

            if (movies.isEmpty()) {
                return ResponseEntity.noContent().build();
            }

            return ResponseEntity.ok(movies);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/recent")
    public ResponseEntity<List<MovieOscar>> getRecentMovies() {
        List<MovieOscar> recentMovies = movieOscarService.getRecentMovies();

        if (recentMovies.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(recentMovies);
    }

    @GetMapping("/stats/count")
    public ResponseEntity<Long> getCount() {
        long count = movieOscarService.countMovies();
        return ResponseEntity.ok(count);
    }
}