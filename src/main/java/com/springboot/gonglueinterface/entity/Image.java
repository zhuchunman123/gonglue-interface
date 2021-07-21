package com.springboot.gonglueinterface.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(schema = "travel_tips",name = "t_image")
public class Image {

  @Id
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "size")
  private String size;
  @Column(name = "path")
  private String path;
  @Column(name = "type")
  private String type;
  @Column(name = "user_Id")
  private long userId;
  @Column(name = "create_Time")
  private Date createTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
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


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
