package com.example.examserver.service.impl;

import com.example.examserver.models.User;
import com.example.examserver.models.UserRole;
import com.example.examserver.repo.RoleRepository;
import com.example.examserver.repo.UserRepository;
import com.example.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoleSet) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());
        if(local != null){
            System.out.println("User is present");
            throw new Exception("User is reserved!");
        } else {
            for(UserRole ur:userRoleSet){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoleSet().addAll(userRoleSet);
            local = this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username){
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId){
        this.userRepository.deleteById(userId);
    }

    @Override
    public List<User> getAll(){
        return this.userRepository.findAll();
    }
}
