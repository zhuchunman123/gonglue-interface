package com.springboot.gonglueinterface.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.Date;

/**
* Create by Generate...
* Date: Wed Jul 28 11:48:07 CST 2021
* 
* @author fhrdr
*/
@Entity
@Table(name = "t_image")
public class Image {

	/**
	 * 图片id
	 */
	@Id
	private String id;
	/**
	 * 图片名字
	 */
	@Column(name = "name" )
	private String name;
	/**
	 * 图片大小
	 */
	@Column(name = "size" )
	private String size;
	/**
	 * 图片地址
	 */
	@Column(name = "path" )
	private String path;
	/**
	 * 图片格式
	 */
	@Column(name = "type" )
	private String type;
	/**
	 * 图片集
	 */
	@Column(name = "close" )
	private String close;
	/**
	 * 发布者id
	 */
	@Column(name = "user_id" )
	private String userId;
	/**
	 * 发布时间
	 */
	@Column(name = "create_time" )
	private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
