package ru.hagrik.webmvc.dao;

import ru.hagrik.webmvc.model.Role;

import java.util.List;

public interface RoleDao {

    void createRole(Role role);

    List<Role> getRoleList();

    Role getRoleByRoleName(String role);
}
