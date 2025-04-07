package com.videostore.modules.district.controller;

import com.videostore.modules.district.dto.DistrictDTO;
import com.videostore.modules.district.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/districts")
@RequiredArgsConstructor
public class DistrictController {

    private final DistrictService districtService;

    @PostMapping
    public ResponseEntity<DistrictDTO> create(@RequestBody DistrictDTO dto) {
        return ResponseEntity.ok(districtService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<DistrictDTO>> getAll() {
        return ResponseEntity.ok(districtService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DistrictDTO> getById(@PathVariable Integer id) {
        DistrictDTO dto = districtService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        districtService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
