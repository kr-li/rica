package com.music.rica.service;

import com.music.rica.dao.mapper.UserLoginInfoMapper;
import com.music.rica.entity.UserLoginInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class UserLoginService {

    @Resource
    private UserLoginInfoMapper userLoginInfoMapper;

    public Boolean checkLoginUser(String userName, String password){
        UserLoginInfo userLoginInfo = userLoginInfoMapper.selectByUserNameAndPassword(userName, password);
        if (Objects.nonNull(userLoginInfo)){
            return true;
        } else {
            return false;
        }
    }
}
