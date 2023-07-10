package com.music.rica.dao.mapper;

import com.music.rica.entity.UserLoginInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Repository
@Mapper
public interface UserLoginInfoMapper extends BaseMapper<UserLoginInfo> {

    @Select("select * from user_login_info where user_name = #{user_name} and password = #{password}")
    UserLoginInfo selectByUserNameAndPassword(@Param("user_name") String userName, @Param("password") String password);
}
