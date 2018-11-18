package cn.liueleven.mybatis.mapper;


import cn.liueleven.mybatis.domain.User;

import java.util.List;

public interface UserMapper {



    List<User> findAll();
}
