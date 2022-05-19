package com.spring.sec.service;

import com.spring.sec.dto.RoleDto;
import com.spring.sec.entity.User;
import com.spring.sec.model.SignUpRequest;

public interface RoleService {
    RoleDto addRole(RoleDto r);
}
