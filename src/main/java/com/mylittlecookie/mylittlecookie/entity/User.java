package com.mylittlecookie.mylittlecookie.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@NoArgsConstructor
@Getter
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;  //사용자 기본키(pk)

    @Column(nullable = false, unique = true)
    private String username;  //사용자 닉네임

    @Column(nullable = false, unique = true)
    private String nickName;

    @Column
    private String password;  //사용자 비밀번호

    @Column(nullable = false, unique = true)
    private String email;  //사용자 이메일




}
