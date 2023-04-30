package com.xuxian.service;

import com.xuxian.domain.entity.ResponseResult;
import com.xuxian.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}