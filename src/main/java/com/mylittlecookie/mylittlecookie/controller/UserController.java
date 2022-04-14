package com.mylittlecookie.mylittlecookie.controller;


import com.mylittlecookie.mylittlecookie.dto.UserRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("/join")
    public String userJoin() {
        return "join";
    }

//    @PostMapping("/join")
//    public String newUser (@Valid UserRequestDto userRequestDto, BindingResult bindingResult, Model model){
//        if(bindingResult.hasErrors()){
//            return "join";
//        }
//
//        try{
//            유저 저장
//        }catch (){
//
//        }
//        return "redirect:/";
//    }

}
