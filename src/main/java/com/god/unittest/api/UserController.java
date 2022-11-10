package com.god.unittest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/v1/users/create")
    public Result createUser(@RequestBody UserVo userVo) {
        return userService.save(userVo);
    }
}
