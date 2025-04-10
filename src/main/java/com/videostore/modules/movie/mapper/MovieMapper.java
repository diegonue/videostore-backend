package com.videostore.modules.movie.mapper;

import com.videostore.modules.actor.model.Actor;
import com.videostore.modules.director.model.Director;
import com.videostore.modules.genre.model.Genre;
import com.videostore.modules.movie.dto.MovieDTO;
import com.videostore.modules.movie.model.Movie;
import com.videostore.modules.movietype.model.MovieType;

import java.util.Set;
import java.util.stream.Collectors;

public class MovieMapper {

    public static MovieDTO toDTO(Movie movie){
        MovieDTO dto = new MovieDTO();
        dto.setId(movie.getId());
        dto.setTitle(movie.getTitle());
        dto.setDescription(movie.getDescription());
        dto.setPrice(movie.getPrice());
        dto.setDuration(movie.getDuration());
        dto.setCopyCount(movie.getCopyCount());
        dto.setGenreId(movie.getGenre() != null ? movie.getGenre().getId() : null);
        dto.setMovieTypeId(movie.getMovieType() != null ? movie.getMovieType().getId() : null);
        dto.setActorIds(movie.getActors().stream().map(Actor::getId).collect(Collectors.toSet()));
        dto.setDirectorsIds(movie.getDirectors().stream().map(Director::getId).collect(Collectors.toSet()));
        return dto;
    }

    public static Movie toEntity(MovieDTO dto,
                                 Genre genre,
                                 MovieType movieType,
                                 Set<Director> directors,
                                 Set<Actor> actors){
        return Movie.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .duration(dto.getDuration())
                .copyCount(dto.getCopyCount())
                .genre(genre)
                .movieType(movieType)
                .directors(directors)
                .actors(actors)
                .build();
    }

}
