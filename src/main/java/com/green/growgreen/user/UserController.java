package com.green.growgreen.user;

import com.green.growgreen.ResVo;
import com.green.growgreen.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    @PostMapping("/signup")
    public ResVo postUser(@RequestBody UserInsDto dto){
        return service.postUser(dto);
    }
}
