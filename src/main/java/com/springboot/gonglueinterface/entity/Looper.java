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
@Table(name = "t_looper")
public class Looper {

	/**
	 * 轮播图id
	 */
	@Id
	private String id;
	/**
	 * 图片id
	 */
	@Column(name = "image_id" )
	private String imageId;
	/**
	 * 目标网址
	 */
	@Column(name = "path" )
	private String path;
	/**
	 * 帖子id
	 */
	@Column(name = "post_id" )
	private String postId;
	/**
	 * 轮播图标题
	 */
	@Column(name = "title" )
	private String title;
	/**
	 * 轮播图顺序
	 */
	@Column(name = "order" )
	private Long order;
	/**
	 * 轮播图状态
	 */
	@Column(name = "state" )
	private Boolean state;
	/**
	 * 创建时间
	 */
	@Column(name = "create_time" )
	private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }


  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
    this.state = state;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
