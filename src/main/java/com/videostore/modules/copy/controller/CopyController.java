package com.videostore.modules.copy.controller;

import com.videostore.modules.copy.dto.CopyDTO;
import com.videostore.modules.copy.service.CopyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/copies")
@RequiredArgsConstructor
public class CopyController {

    private final CopyService copyService;

    @PostMapping
    public ResponseEntity<CopyDTO> create(@RequestBody CopyDTO dto) {
        return ResponseEntity.ok(copyService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<CopyDTO>> getAll() {
        return ResponseEntity.ok(copyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CopyDTO> getById(@PathVariable Integer id) {
        CopyDTO dto = copyService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        copyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
