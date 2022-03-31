package com.mylittlecookie.mylittlecookie.entity;



import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@RequiredArgsConstructor
@Entity
public class Pet {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column
    private String petName; //반려동물 이름

    @Column
    private String petAge; //반려동물 나이

    @Column
    private String petType;   //반려동물 종류(개,고양이,토끼,고슴도치,도마뱀...)

    @ManyToOne   //사용자 정보 받아오기
    @JoinColumn(name = "userinfo")
    private User user;


}
