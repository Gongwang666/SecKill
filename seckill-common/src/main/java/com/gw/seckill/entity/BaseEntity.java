package com.gw.seckill.entity;

import java.io.Serializable;
import java.util.Date;

/**
　* @描述:     基础实体类，包含各实体公用属性 .
　* @异常:     
　* @作者:     gongwang
　* @创建时间: 2017/12/28 14:20
  */
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 主键ID **/
	private Long id;
	
	/** 创建时间 **/
	private Date createTime;
	
	
	/** 主键ID **/
	public Long getId() {
		return id;
	}
	
	/** 主键ID **/
	public void setId(Long id) {
		this.id = id;
	}

	/** 创建时间 **/
	public Date getCreateTime() {
		return createTime;
	}
	
	/** 创建时间 **/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
