package com.apioscarsmovies.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movie_oscar") // Colección en MongoDB

public class MovieOscar {
    @Id
    private String id; //Generado automáticamente por MongoDB

    @Field("titleMovie")
    private String titleMovie;

    @Field("directorMovie")
    private String directorMovie;

    @Field("yearMovie")
    private Integer yearMovie;

    @Field("durationMovie")
    private Integer durationMovie;

    @Field("actressMovie")
    private String actressMovie;

    @Field("actorMovie")
    private String actorMovie;

    @Field("posterUrlMovie")
    private String posterUrlMovie;

    // Constructor sin id para registrar nuevas películas
    public MovieOscar(String titleMovie, String directorMovie, Integer yearMovie, Integer durationMovie, String actressMovie, String actorMovie, String posterUrlMovie) {
        this.titleMovie = titleMovie;
        this.directorMovie = directorMovie;
        this.yearMovie = yearMovie;
        this.durationMovie = durationMovie;
        this.actressMovie = actressMovie;
        this.actorMovie = actorMovie;
        this.posterUrlMovie = posterUrlMovie;
    }
}
