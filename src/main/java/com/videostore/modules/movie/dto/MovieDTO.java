package com.videostore.modules.movie.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Set;

@Data
public class MovieDTO {

    private Integer id;
    @NotBlank(message = "El título de la película es obligatorio")
    private String title;

    @NotBlank(message = "La descripción es obligatoria")
    private String description;

    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.0", inclusive = false, message = "El precio debe ser mayor que cero")
    private Double price;

    @NotNull(message = "La duración es obligatoria")
    @Min(value = 1, message = "La duración debe ser al menos de 1 minuto")
    private Double duration;

    @NotNull(message = "La cantidad de copias es obligatoria")
    @Min(value = 0, message = "La cantidad de copias no puede ser negativa")
    private Integer copyCount;

    @NotNull(message = "Debes seleccionar un género")
    private Integer genreId;

    @NotNull(message = "Debes seleccionar un tipo de película")
    private Integer movieTypeId;

    @NotEmpty(message = "Debes seleccionar al menos un actor")
    private Set<Integer> actorIds;

    @NotEmpty(message = "Debes seleccionar al menos un director")
    private Set<Integer> directorIds;
}
