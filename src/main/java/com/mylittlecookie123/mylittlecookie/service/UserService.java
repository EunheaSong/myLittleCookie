package com.mylittlecookie123.mylittlecookie.service;


import com.mylittlecookie123.mylittlecookie.dto.UserRequestDto;
import com.mylittlecookie123.mylittlecookie.entity.User;
import com.mylittlecookie123.mylittlecookie.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

//    public void checkUsername (String name){
//        Optional<User> found = userRepository.findByUsername(name);
//        if (found.isPresent()) { //isPresent() -> null이면 false, null이 아니면, true를 반환해준다.
//            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
//        }
//    }
    @Transactional
    public void joinUser (UserRequestDto userRequestDto){
        Optional<User> found = userRepository.findByUsername(userRequestDto.getUsername());
        if (found.isPresent()) { //isPresent() -> null이면 false, null이 아니면, true를 반환해준다.
            throw new IllegalArgumentException("이미 사용중인 아이디입니다.");
        }
        Optional<User> foundNick = userRepository.findByNickname(userRequestDto.getNickname());
        if (foundNick.isPresent()){
            throw new IllegalArgumentException("이미 사용중인 닉네임입니다.");
        }
        Optional<User> foundEmail = userRepository.findByEmail(userRequestDto.getEmail());
        if (foundEmail.isPresent()){
            throw new IllegalArgumentException("이미 사용중인 이메일입니다.");
        }
        if (!userRequestDto.getPassword().equals(userRequestDto.getCheckPassword())){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        String password = passwordEncoder.encode(userRequestDto.getPassword());
        User user = User.builder()
                .username(userRequestDto.getUsername())
                .password(password)
                .nickname(userRequestDto.getNickname())
                .email(userRequestDto.getEmail())
                .build();
        userRepository.save(user);
    }


}
