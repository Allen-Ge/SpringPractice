package cn.geyao.spring.practice.war.service;

import cn.geyao.spring.practice.war.model.User;

public interface IUserService {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	User selectUserWithLevelByPrimarykey(Integer id);

	User selectUserWithHobbiesByPrimarykey(Integer id);

	User selectUserWithLevelAndHobbiesByPrimarykey(Integer id);
}