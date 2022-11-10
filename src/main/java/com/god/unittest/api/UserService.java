package com.god.unittest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Result save(UserVo userVo) {
        return null;
    }
}
