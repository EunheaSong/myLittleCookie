package com.mylittlecookie123.mylittlecookie.controller;




import com.mylittlecookie123.mylittlecookie.dto.UserRequestDto;
import com.mylittlecookie123.mylittlecookie.repository.UserRepository;
import com.mylittlecookie123.mylittlecookie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/user")
@Controller
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @GetMapping("/join")
    public String userJoin(Model model) {
        model.addAttribute("userRequestDto",new UserRequestDto());
        return "join";
    }

//    @ResponseBody
//    @PostMapping("/check")
//    public void checkUsername (@RequestBody String name){
//        userService.checkUsername(name);
//
//    }

    @PostMapping("/join")
    public String newUser (@Valid UserRequestDto userRequestDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "join";
        }
        try{
            userService.joinUser(userRequestDto);
            return "redirect:/";
        }catch (IllegalArgumentException e){
            model.addAttribute("message",e.getMessage());
            return "join";
        }
    }

}
