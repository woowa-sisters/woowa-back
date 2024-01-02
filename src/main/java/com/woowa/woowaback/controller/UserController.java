package com.woowa.woowaback.controller;

//import com.woowa.woowaback.entity.User;
//import com.woowa.woowaback.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
//    private final UserService userService;

    @GetMapping("/user/test")
    public String userTest(){
        return "Hello User!";
    }

//    @GetMapping("/user")
//    public List<User> getUser(){
//        return userService.getUser();
//    }

}
