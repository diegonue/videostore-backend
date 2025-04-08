package com.videostore.modules.rentaldetailstatus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rental_detail_statuses")
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class RentalDetailStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

}
