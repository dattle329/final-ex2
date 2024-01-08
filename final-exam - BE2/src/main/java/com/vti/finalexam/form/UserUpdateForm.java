package com.vti.finalexam.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UserUpdateForm {
    @NotBlank
    @Length(max = 50)
    private String name;

    @NotBlank
    @Length(max = 16)
    private String password;

    @NotBlank
    @Length(max = 50)
    @Email
    private String email;

    @NotBlank
    @Length(max = 50)
    private String username;
}
