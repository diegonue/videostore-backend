package com.videostore.modules.employeerole.controller;

import com.videostore.modules.employeerole.dto.EmployeeRoleDTO;
import com.videostore.modules.employeerole.mapper.EmployeeRoleMapper;
import com.videostore.modules.employeerole.model.EmployeeRole;
import com.videostore.modules.employeerole.service.EmployeeRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-roles")
@RequiredArgsConstructor
public class EmployeeRoleController {

    private final EmployeeRoleService employeeRoleService;

    @PostMapping
    public ResponseEntity<EmployeeRoleDTO> create(@RequestBody EmployeeRoleDTO dto) {
        return ResponseEntity.ok(employeeRoleService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeRoleDTO>> getAll() {
        return ResponseEntity.ok(employeeRoleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeRoleDTO> getById(@PathVariable Integer id) {
        EmployeeRoleDTO dto = employeeRoleService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        employeeRoleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
