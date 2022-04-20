package com.mylittlecookie123.mylittlecookie.entity;



import lombok.Getter;


import javax.persistence.*;


@Getter
@Entity
public class Pet extends Timestamped {

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
    @JoinColumn(name = "USER_ID")
    private User user;


}
