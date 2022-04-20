package com.mylittlecookie123.mylittlecookie.entity;

import lombok.*;

import javax.persistence.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class User extends Timestamped {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;  //사용자 기본키(pk)

    @Column(nullable = false, unique = true)
    private String username;  //사용자 닉네임

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column
    private String password;  //사용자 비밀번호

    @Column(nullable = false, unique = true)
    private String email;  //사용자 이메일

    @OneToMany(mappedBy = "user")
    private List<Pet> pets;


}
