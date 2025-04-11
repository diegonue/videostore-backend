package com.videostore.modules.member.controller;

import com.videostore.modules.member.dto.MemberDTO;
import com.videostore.modules.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberDTO> create(@Valid @RequestBody MemberDTO dto) {
        return ResponseEntity.ok(memberService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<MemberDTO>> getAll() {
        return ResponseEntity.ok(memberService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDTO> getById(@PathVariable Integer id) {
        MemberDTO dto = memberService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        memberService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
