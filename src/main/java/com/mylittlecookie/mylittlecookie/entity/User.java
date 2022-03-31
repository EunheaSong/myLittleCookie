package com.mylittlecookie.mylittlecookie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Getter
@RequiredArgsConstructor
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;  //사용자 기본키(pk)

    @Column
    private String username;  //사용자 닉네임

    @Column
    private String password;  //사용자 비밀번호

    @Column
    private String email;  //사용자 이메일






}
