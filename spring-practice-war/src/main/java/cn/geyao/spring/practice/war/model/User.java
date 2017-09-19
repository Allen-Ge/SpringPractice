package cn.geyao.spring.practice.war.model;

import java.util.Date;
import java.util.List;

public class User {
	private Integer id;

	private String name;

	private Byte age;

	private Date addTime;

	private Date updateTime;

	private Byte mark;

	private UserLevel userLevel;

	private List<UserHobby> userHobbies;

	public UserLevel getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(UserLevel userLevel) {
		this.userLevel = userLevel;
	}

	public List<UserHobby> getUserHobbies() {
		return userHobbies;
	}

	public void setUserHobbies(List<UserHobby> userHobbies) {
		this.userHobbies = userHobbies;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getMark() {
		return mark;
	}

	public void setMark(Byte mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", addTime=" + addTime + ", updateTime="
				+ updateTime + ", mark=" + mark + ", userLevel=" + userLevel + ", userHobbies=" + userHobbies + "]";
	}

}