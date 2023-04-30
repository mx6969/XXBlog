package com.xuxian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuxian.domain.entity.User;
import com.xuxian.mapper.UserMapper;
import com.xuxian.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2023-04-30 16:04:11
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
