package com.apioscarsmovies.backend.repository;

import com.apioscarsmovies.backend.model.MovieOscar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MovieOscarRepository extends MongoRepository<MovieOscar, String> {

    // Busquedas personalizadas utiles para el frontend

    // Buscar por title (parcial o exacto)
    List<MovieOscar> findByTitleMovieContainingIgnoreCase(String title);

    // Buscar por director
    List<MovieOscar> findByDirectorMovie(String director);

    // Buscar por year
    List<MovieOscar> findByYearMovie(Integer year);

    // Buscar por actress principal
    List<MovieOscar> findByActressMovie(String actress);

    // Buscar por actor principal
    List<MovieOscar> findByActorMovie(String actor);

    // Peliculas ordenadas por año (más reciente primero)
    List<MovieOscar> findAllByOrderByYearMovieDesc();

    // Buscar entre years especificos
    List<MovieOscar> findByYearMovieBetween(Integer startYear, Integer endYear);

    // Buseuda con consulta personalizada (mas compleja)
    @Query("{'titleMovie' : { $regex: ?0, $options: 'i' } }")
    List<MovieOscar> findByTitleMoviePersonalized(String title);
}

