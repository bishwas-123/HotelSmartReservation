package com.hsr.demo.application.service.user;


import com.hsr.demo.application.model.user.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();
    Role save(Role role);
    Role finById(Integer roleId);
}
