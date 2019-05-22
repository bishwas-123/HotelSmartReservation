package com.hsr.demo.application.service.user.implement;

import com.hsr.demo.application.model.user.Role;
import com.hsr.demo.application.repository.user.IRoleRepository;
import com.hsr.demo.application.service.user.IRoleService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    private IRoleRepository roleRepository;
    public RoleService(IRoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll(Sort.by("firstName"));
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role findById(Integer roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }
}
