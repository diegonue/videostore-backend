package com.videostore.modules.copy.model;

import com.videostore.common.model.AuditableEntity;
import com.videostore.modules.copystatus.model.CopyStatus;
import com.videostore.modules.movie.model.Movie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "copies")
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Copy extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private CopyStatus copyStatus;

}
