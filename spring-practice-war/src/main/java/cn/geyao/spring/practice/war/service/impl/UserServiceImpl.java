package cn.geyao.spring.practice.war.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.geyao.spring.practice.war.dao.UserMapper;
import cn.geyao.spring.practice.war.model.User;
import cn.geyao.spring.practice.war.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public User selectUserWithLevelByPrimarykey(Integer id) {
		return userMapper.selectUserWithLevelByPrimarykey(id);
	}

	@Override
	public User selectUserWithHobbiesByPrimarykey(Integer id) {
		return userMapper.selectUserWithHobbiesByPrimarykey(id);
	}

	@Override
	public User selectUserWithLevelAndHobbiesByPrimarykey(Integer id) {
		return userMapper.selectUserWithLevelAndHobbiesByPrimarykey(id);
	}

}
