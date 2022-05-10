package com.spring.sec.service.impl;

import com.spring.sec.dto.RoleDto;
import com.spring.sec.entity.Role;
import com.spring.sec.repository.RoleRepo;
import com.spring.sec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepo roleRepo;

    @Override
    public RoleDto addRole(RoleDto r) {
//        Role role = new Role(r.getRole());
    return new RoleDto();
    }
}
