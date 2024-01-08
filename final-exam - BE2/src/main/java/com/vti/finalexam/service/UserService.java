package com.vti.finalexam.service;


import com.vti.finalexam.dto.UserDto;
import com.vti.finalexam.entity.User;
import com.vti.finalexam.form.UserCreateForm;
import com.vti.finalexam.form.UserUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserDto> findAll(Pageable pageable);

    User findUserByUsername(String username);

    UserDto create(UserCreateForm form);

    UserDto update(UserUpdateForm form, Long id);

    void delete(Long id);
}
