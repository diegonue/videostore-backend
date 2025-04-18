package com.videostore.modules.member.service;

import com.videostore.common.util.EntityFinder;
import com.videostore.modules.district.model.District;
import com.videostore.modules.district.repository.DistrictRepository;
import com.videostore.modules.member.dto.MemberDTO;
import com.videostore.modules.member.mapper.MemberMapper;
import com.videostore.modules.member.model.Member;
import com.videostore.modules.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final DistrictRepository districtRepository;
    private final EntityFinder finder;

    @Override
    public MemberDTO save(MemberDTO dto) {
        District district = finder.findOrThrow(districtRepository, dto.getDistrictId(), "Distrito");

        Member member = MemberMapper.toEntity(dto, district);
        return MemberMapper.toDTO(memberRepository.save(member));
    }

    @Override
    public List<MemberDTO> findAll() {
        return memberRepository.findAll()
                .stream()
                .map(MemberMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MemberDTO findById(Integer id) {
        return memberRepository.findById(id)
                .map(MemberMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        memberRepository.deleteById(id);
    }
}
