package com.c2.mapper;

import com.c2.model.Role;



public interface RoleMapper {
    public Role getRole(Long id);
    public Role findRole(String roleName);
    public int updateRole(Role role);
    public int deleteRole(Long id);
    public int insertRole(Role role);
}
