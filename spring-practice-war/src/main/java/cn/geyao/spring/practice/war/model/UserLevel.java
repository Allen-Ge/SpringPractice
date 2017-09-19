package cn.geyao.spring.practice.war.model;

import java.util.Date;

public class UserLevel {
	private Integer id;

	private Integer userId;

	private Byte custLevel;

	private Date addTime;

	private Date updateTime;

	private Byte mark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Byte getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(Byte custLevel) {
		this.custLevel = custLevel;
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
		return "UserLevel [id=" + id + ", userId=" + userId + ", custLevel=" + custLevel + ", addTime=" + addTime
				+ ", updateTime=" + updateTime + ", mark=" + mark + "]";
	}

}