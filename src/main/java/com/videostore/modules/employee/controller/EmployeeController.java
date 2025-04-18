package com.videostore.modules.employee.controller;

import com.videostore.modules.employee.dto.EmployeeDTO;
import com.videostore.modules.employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDTO> create(@Valid @RequestBody EmployeeDTO dto) {
        return ResponseEntity.ok(employeeService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getById(@PathVariable Integer id) {
        EmployeeDTO dto = employeeService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        employeeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/by-role/{roleId}")
    public ResponseEntity<List<EmployeeDTO>> getByRole(@PathVariable Integer roleId) {
        return ResponseEntity.ok(employeeService.findByRoleId(roleId));
    }

    @GetMapping("/count-by-role")
    public ResponseEntity<List<Map<String, Object>>> countByRole() {
        return ResponseEntity.ok(employeeService.countEmployeesByRole());
    }

}
