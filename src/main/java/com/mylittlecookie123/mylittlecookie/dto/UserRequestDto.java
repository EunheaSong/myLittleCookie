package com.mylittlecookie123.mylittlecookie.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDto {

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    @Pattern(regexp = "^(?=.*[a-zA-Z])[-a-zA-Z0-9]{6,15}$", message = "아이디 형식이 올바르지 않습니다.")
    private String username;

    @NotBlank(message = "닉네임은 필수 입력 값입니다.")
    @Pattern(regexp = "^[가-힣-a-zA-Z0-9]{2,10}$", message = "닉네임 형식이 올바르지 않습니다.")
    private String nickname;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-zA-Z])[0-9a-zA-Z~!@#$%^&*]{8,20}$", message = "비밀번호 형식이 올바르지 않습니다.")
    private String password;

    @NotBlank(message = "비밀번호 재확인은 필수입니다.")
    private String checkPassword;

    @NotBlank(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;


}
