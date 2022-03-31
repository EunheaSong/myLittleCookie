package com.mylittlecookie.mylittlecookie.dto;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UserRequestDto {

    private String username;

    private String password;

    private String email;


}
