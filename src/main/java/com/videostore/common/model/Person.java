package com.videostore.common.model;

import com.videostore.modules.district.model.District;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Data
@NoArgsConstructor @AllArgsConstructor
@SuperBuilder
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String address;
    private String dni;
    private String email;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

}
