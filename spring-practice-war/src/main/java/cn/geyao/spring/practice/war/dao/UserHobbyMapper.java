package cn.geyao.spring.practice.war.dao;

import cn.geyao.spring.practice.war.model.UserHobby;

public interface UserHobbyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserHobby record);

    int insertSelective(UserHobby record);

    UserHobby selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserHobby record);

    int updateByPrimaryKey(UserHobby record);
}