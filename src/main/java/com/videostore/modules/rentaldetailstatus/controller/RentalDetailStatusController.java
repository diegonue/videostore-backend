package com.videostore.modules.rentaldetailstatus.controller;

import com.videostore.modules.rentaldetailstatus.dto.RentalDetailStatusDTO;
import com.videostore.modules.rentaldetailstatus.service.RentalDetailStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rental-detail-statuses")
@RequiredArgsConstructor
public class RentalDetailStatusController {

    private final RentalDetailStatusService rentalDetailStatusService;

    @PostMapping
    public ResponseEntity<RentalDetailStatusDTO> create(@RequestBody RentalDetailStatusDTO dto) {
        return ResponseEntity.ok(rentalDetailStatusService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<RentalDetailStatusDTO>> getAll() {
        return ResponseEntity.ok(rentalDetailStatusService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RentalDetailStatusDTO> getById(@PathVariable Integer id) {
        RentalDetailStatusDTO dto = rentalDetailStatusService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        rentalDetailStatusService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
