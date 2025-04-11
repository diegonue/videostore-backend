package com.videostore.modules.employee.service;

import com.videostore.modules.district.model.District;
import com.videostore.modules.district.repository.DistrictRepository;
import com.videostore.modules.employee.dto.EmployeeDTO;
import com.videostore.modules.employee.mapper.EmployeeMapper;
import com.videostore.modules.employee.model.Employee;
import com.videostore.modules.employee.repository.EmployeeRepository;
import com.videostore.modules.employeerole.model.EmployeeRole;
import com.videostore.modules.employeerole.repository.EmployeeRoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DistrictRepository districtRepository;
    private final EmployeeRoleRepository employeeRoleRepository;

    @Override
    public EmployeeDTO save(EmployeeDTO dto) {
        District district = districtRepository.findById(dto.getDistrictId()).orElseThrow();
        EmployeeRole employeeRole = employeeRoleRepository.findById(dto.getRoleId()).orElseThrow();

        Employee employee = EmployeeMapper.toEntity(dto, district, employeeRole);
        return EmployeeMapper.toDTO(employeeRepository.save(employee));
    }

    @Override
    public List<EmployeeDTO> findAll() {
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO findById(Integer id) {
        return employeeRepository.findById(id)
                .map(EmployeeMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }

}
