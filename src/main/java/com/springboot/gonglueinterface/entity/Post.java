package com.springboot.gonglueinterface.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.Date;

/**
* Create by Generate...
* Date: Wed Jul 28 11:47:13 CST 2021
* 
* @author fhrdr
*/
@Entity
@Table(name = "t_post")
public class Post {

	/**
	 * 帖子ID
	 */
	@Id
	private String id;
	/**
	 * 帖子名
	 */
	@Column(name = "name" )
	private String name;
	/**
	 * 帖子介绍
	 */
	@Column(name = "introdouce" )
	private String introdouce;
	/**
	 * 作者id
	 */
	@Column(name = "user_id" )
	private String userId;
	/**
	 * 帖子浏览数
	 */
	@Column(name = "view_num" )
	private Long viewNum;
	/**
	 * 帖子点赞数
	 */
	@Column(name = "like_num" )
	private Long likeNum;
	/**
	 * 帖子收藏数
	 */
	@Column(name = "collection_num" )
	private Long collectionNum;
	/**
	 * 帖子分享数
	 */
	@Column(name = "share_num" )
	private Long shareNum;
	/**
	 * 帖子评论数
	 */
	@Column(name = "comment_num" )
	private Long commentNum;
	/**
	 * 帖子打赏数
	 */
	@Column(name = "reward" )
	private Long reward;
	/**
	 * 帖子总分
	 */
	@Column(name = "total" )
	private Long total;
	/**
	 * 帖子图片id
	 */
	@Column(name = "avatar" )
	private String avatar;
	/**
	 * 帖子类别（0为草稿，1为发布）
	 */
	@Column(name = "state" )
	private Boolean state;
	/**
	 * 帖子地域
	 */
	@Column(name = "area" )
	private String area;
	/**
	 * 帖子详细地址
	 */
	@Column(name = "address" )
	private String address;
	/**
	 * 帖子营业时间
	 */
	@Column(name = "work_time" )
	private String workTime;
	/**
	 * 帖子时间类别
	 */
	@Column(name = "time_style" )
	private String timeStyle;
	/**
	 * 帖子优惠政策
	 */
	@Column(name = "discount" )
	private String discount;
	/**
	 * 实用小贴士
	 */
	@Column(name = "tip" )
	private String tip;
	/**
	 * 景区价格
	 */
	@Column(name = "price" )
	private String price;
	/**
	 * 线路
	 */
	@Column(name = "road" )
	private String road;
	/**
	 * 帖子分类id
	 */
	@Column(name = "sort_id" )
	private String sortId;
	/**
	 * 帖子创建时间
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


  public String getIntrodouce() {
    return introdouce;
  }

  public void setIntrodouce(String introdouce) {
    this.introdouce = introdouce;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Long getViewNum() {
    return viewNum;
  }

  public void setViewNum(Long viewNum) {
    this.viewNum = viewNum;
  }


  public Long getLikeNum() {
    return likeNum;
  }

  public void setLikeNum(Long likeNum) {
    this.likeNum = likeNum;
  }


  public Long getCollectionNum() {
    return collectionNum;
  }

  public void setCollectionNum(Long collectionNum) {
    this.collectionNum = collectionNum;
  }


  public Long getShareNum() {
    return shareNum;
  }

  public void setShareNum(Long shareNum) {
    this.shareNum = shareNum;
  }


  public Long getCommentNum() {
    return commentNum;
  }

  public void setCommentNum(Long commentNum) {
    this.commentNum = commentNum;
  }


  public Long getReward() {
    return reward;
  }

  public void setReward(Long reward) {
    this.reward = reward;
  }


  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
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


  public String getRoad() {
    return road;
  }

  public void setRoad(String road) {
    this.road = road;
  }


  public String getSortId() {
    return sortId;
  }

  public void setSortId(String sortId) {
    this.sortId = sortId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
