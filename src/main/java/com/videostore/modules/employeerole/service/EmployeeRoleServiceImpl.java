package com.videostore.modules.employeerole.service;

import com.videostore.modules.employeerole.dto.EmployeeRoleDTO;
import com.videostore.modules.employeerole.mapper.EmployeeRoleMapper;
import com.videostore.modules.employeerole.model.EmployeeRole;
import com.videostore.modules.employeerole.repository.EmployeeRoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeRoleServiceImpl implements EmployeeRoleService {

    private final EmployeeRoleRepository employeeRoleRepository;

    @Override
    public EmployeeRoleDTO save(EmployeeRoleDTO dto) {
        EmployeeRole entity = EmployeeRoleMapper.toEntity(dto);
        return EmployeeRoleMapper.toDTO(employeeRoleRepository.save(entity));
    }

    @Override
    public List<EmployeeRoleDTO> findAll() {
        return employeeRoleRepository.findAll()
                .stream()
                .map(EmployeeRoleMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeRoleDTO findById(Integer id) {
        return employeeRoleRepository.findById(id)
                .map(EmployeeRoleMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        employeeRoleRepository.deleteById(id);
    }



}
