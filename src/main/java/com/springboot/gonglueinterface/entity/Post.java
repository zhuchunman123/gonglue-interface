package com.springboot.gonglueinterface.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(schema = "travel_tips",name = "t_post")
public class Post {

  @Id
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "introduce")
  private String introduce;
  @Column(name = "user_Id")
  private long userId;
  @Column(name = "view_Num")
  private long viewNum;
  @Column(name = "like_Num")
  private long likeNum;
  @Column(name = "collection_Num")
  private long collectionNum;
  @Column(name = "share_Num")
  private long shareNum;
  @Column(name = "comment_Num")
  private long commentNum;
  @Column(name = "reward")
  private long reward;
  @Column(name = "total")
  private long total;
  @Column(name = "avatar")
  private long avatar;
  @Column(name = "state")
  private String state;
  @Column(name = "area")
  private String area;
  @Column(name = "address")
  private String address;
  @Column(name = "work_Time")
  private String workTime;
  @Column(name = "time_Style")
  private String timeStyle;
  @Column(name = "discount")
  private String discount;
  @Column(name = "tip")
  private String tip;
  @Column(name = "price")
  private String price;
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


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getViewNum() {
    return viewNum;
  }

  public void setViewNum(long viewNum) {
    this.viewNum = viewNum;
  }


  public long getLikeNum() {
    return likeNum;
  }

  public void setLikeNum(long likeNum) {
    this.likeNum = likeNum;
  }


  public long getCollectionNum() {
    return collectionNum;
  }

  public void setCollectionNum(long collectionNum) {
    this.collectionNum = collectionNum;
  }


  public long getShareNum() {
    return shareNum;
  }

  public void setShareNum(long shareNum) {
    this.shareNum = shareNum;
  }


  public long getCommentNum() {
    return commentNum;
  }

  public void setCommentNum(long commentNum) {
    this.commentNum = commentNum;
  }


  public long getReward() {
    return reward;
  }

  public void setReward(long reward) {
    this.reward = reward;
  }


  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }


  public long getAvatar() {
    return avatar;
  }

  public void setAvatar(long avatar) {
    this.avatar = avatar;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getWorkTime() {
    return workTime;
  }

  public void setWorkTime(String workTime) {
    this.workTime = workTime;
  }


  public String getTimeStyle() {
    return timeStyle;
  }

  public void setTimeStyle(String timeStyle) {
    this.timeStyle = timeStyle;
  }


  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }


  public String getTip() {
    return tip;
  }

  public void setTip(String tip) {
    this.tip = tip;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "{" +
            "id:" + id +
            ", name:'" + name + '\'' +
            ", introduce:'" + introduce + '\'' +
            ", userId:" + userId +
            ", viewNum:" + viewNum +
            ", likeNum:" + likeNum +
            ", collectionNum:" + collectionNum +
            ", shareNum:" + shareNum +
            ", commentNum:" + commentNum +
            ", reward:" + reward +
            ", total:" + total +
            ", avatar:" + avatar +
            ", state:'" + state + '\'' +
            ", area:'" + area + '\'' +
            ", address:'" + address + '\'' +
            ", workTime:'" + workTime + '\'' +
            ", timeStyle:'" + timeStyle + '\'' +
            ", discount:'" + discount + '\'' +
            ", tip:'" + tip + '\'' +
            ", price:'" + price + '\'' +
            ", createTime:" + createTime +
            '}';
  }
}
