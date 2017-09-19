package cn.geyao.spring.practice.war.dao;

import cn.geyao.spring.practice.war.model.UserLevel;

public interface UserLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLevel record);

    int insertSelective(UserLevel record);

    UserLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLevel record);

    int updateByPrimaryKey(UserLevel record);
}