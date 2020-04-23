package com.destiny.mute.module.user.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.destiny.mute.module.user.bean.User;
import com.destiny.mute.module.user.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
}
