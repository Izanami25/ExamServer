package com.example.examserver.service;

import com.example.examserver.models.User;
import com.example.examserver.models.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoleSet) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);

    public List<User> getAll();
}
