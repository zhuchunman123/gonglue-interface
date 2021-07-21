package com.springboot.gonglueinterface.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(schema = "travel_tips",name = "t_user")
public class User {
  @Id
  private int id;
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "wechat")
  private String wechat;
  @Column(name = "avatar")
  private long avatar;
  @Column(name = "sex")
  private String sex;
  @Column(name = "level")
  private long level;
  @Column(name = "experience")
  private long experience;
  @Column(name = "balance")
  private long balance;
  @Column(name = "phone")
  private String phone;
  @Column(name = "introduce")
  private String introduce;
  @Column(name = "role")
  private String role;
  @Column(name = "post_Num")
  private long postNum;
  @Column(name = "collection_Num")
  private long collectionNum;
  @Column(name = "follow_Num")
  private long followNum;
  @Column(name = "fan_Num")
  private long fanNum;
  @Column(name = "create_Time")
  private Date createTime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getWechat() {
    return wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }


  public long getAvatar() {
    return avatar;
  }

  public void setAvatar(long avatar) {
    this.avatar = avatar;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public long getExperience() {
    return experience;
  }

  public void setExperience(long experience) {
    this.experience = experience;
  }


  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public long getPostNum() {
    return postNum;
  }

  public void setPostNum(long postNum) {
    this.postNum = postNum;
  }


  public long getCollectionNum() {
    return collectionNum;
  }

  public void setCollectionNum(long collectionNum) {
    this.collectionNum = collectionNum;
  }


  public long getFollowNum() {
    return followNum;
  }

  public void setFollowNum(long followNum) {
    this.followNum = followNum;
  }


  public long getFanNum() {
    return fanNum;
  }

  public void setFanNum(long fanNum) {
    this.fanNum = fanNum;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", wechat='" + wechat + '\'' +
            ", avatar=" + avatar +
            ", sex='" + sex + '\'' +
            ", level=" + level +
            ", experience=" + experience +
            ", balance=" + balance +
            ", phone='" + phone + '\'' +
            ", introduce='" + introduce + '\'' +
            ", role='" + role + '\'' +
            ", postNum=" + postNum +
            ", collectionNum=" + collectionNum +
            ", followNum=" + followNum +
            ", fanNum=" + fanNum +
            ", createTime=" + createTime +
            '}';
  }
}
