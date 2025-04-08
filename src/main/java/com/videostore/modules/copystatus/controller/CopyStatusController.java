package com.videostore.modules.copystatus.controller;

import com.videostore.modules.copystatus.dto.CopyStatusDTO;
import com.videostore.modules.copystatus.service.CopyStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/copy-statuses")
@RequiredArgsConstructor
public class CopyStatusController {

    private final CopyStatusService copyStatusService;

    @PostMapping
    public ResponseEntity<CopyStatusDTO> create(@RequestBody CopyStatusDTO dto) {
        return ResponseEntity.ok(copyStatusService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<CopyStatusDTO>> getAll() {
        return ResponseEntity.ok(copyStatusService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CopyStatusDTO> getById(@PathVariable Integer id) {
        CopyStatusDTO dto = copyStatusService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        copyStatusService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
