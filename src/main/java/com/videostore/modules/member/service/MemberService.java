package com.videostore.modules.member.service;

import com.videostore.modules.member.dto.MemberDTO;

import java.util.List;

public interface MemberService {

    MemberDTO save(MemberDTO dto);
    List<MemberDTO> findAll();
    MemberDTO findById(Integer id);
    void deleteById(Integer id);

}
