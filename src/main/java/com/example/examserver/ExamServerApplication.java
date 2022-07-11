package com.example.examserver;

import com.example.examserver.models.Role;
import com.example.examserver.models.User;
import com.example.examserver.models.UserRole;
import com.example.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication{

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamServerApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        System.out.println("Start");

        User user = new User();

        user.setFirstName("Ulan");
        user.setLastName("Zhukush");
        user.setUsername("ulanzhukush");
        user.setPassword("zxc");
        user.setEmail("zxc@gmail.com");
        user.setProfile("my.png");

        Role role = new Role();
        role.setRoleId(44L);
        role.setRoleName("ADMIN");

        Set<UserRole> userRoleSet = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setRole(role);
        userRole.setUser(user);
        userRoleSet.add(userRole);
        User user1 = this.userService.createUser(user, userRoleSet);
        System.out.println(user1.getUsername());

    }*/

}
