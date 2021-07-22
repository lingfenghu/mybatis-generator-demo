package cn.hulingfeng.mapper;

import cn.hulingfeng.domain.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}