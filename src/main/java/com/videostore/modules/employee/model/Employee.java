package com.videostore.modules.employee.model;

import com.videostore.common.model.Person;
import com.videostore.modules.employeerole.model.EmployeeRole;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Employee extends Person {

    private LocalDate joinDate;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private EmployeeRole role;

}
