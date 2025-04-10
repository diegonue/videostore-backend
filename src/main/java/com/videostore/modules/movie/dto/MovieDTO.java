package com.videostore.modules.movie.dto;

import lombok.Data;

import java.util.Set;

@Data
public class MovieDTO {

    private Integer id;
    private String title;
    private String description;
    private Double price;
    private Double duration;
    private Integer copyCount;

    private Integer genreId;
    private Integer movieTypeId;

    private Set<Integer> actorIds;
    private Set<Integer> directorIds;
}
