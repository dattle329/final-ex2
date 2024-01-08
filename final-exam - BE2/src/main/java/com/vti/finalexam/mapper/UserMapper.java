package com.vti.finalexam.mapper;

import com.vti.finalexam.dto.UserDto;
import com.vti.finalexam.entity.User;
import com.vti.finalexam.form.UserCreateForm;
import com.vti.finalexam.form.UserUpdateForm;

public class UserMapper {
    public static User map(UserCreateForm form) {
        var user = new User();
        user.setName(form.getName());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        user.setUsername(form.getUsername());
        return user;
    }

    public static User map(UserUpdateForm form, Long id) {
        var user = new User();
        user.setId(id);
        user.setName(form.getName());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        user.setUsername(form.getUsername());
        return user;
    }


    public static UserDto map(User user) {
        var dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setUsername(user.getUsername());
        return dto;
    }
}
