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
@Table(name = "t_news")
public class News {

	/**
	 * 消息id
	 */
	@Id
	private String id;
	/**
	 * 消息内容
	 */
	@Column(name = "content" )
	private String content;
	/**
	 * 消息内容id
	 */
	@Column(name = "content_id" )
	private String contentId;
	/**
	 * 消息状态
	 */
	@Column(name = "state" )
	private Boolean state;
	/**
	 * 消息发送者id
	 */
	@Column(name = "user_Q_id" )
	private String user1Id;
	/**
	 * 消息接收者id
	 */
	@Column(name = "user_R_id" )
	private String user2Id;
	/**
	 * 消息类别
	 */
	@Column(name = "type" )
	private String type;
	/**
	 * 消息发送时间
	 */
	@Column(name = "create_time" )
	private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
    this.state = state;
  }


  public String getUser1Id() {
    return user1Id;
  }

  public void setUser1Id(String user1Id) {
    this.user1Id = user1Id;
  }


  public String getUser2Id() {
    return user2Id;
  }

  public void setUser2Id(String user2Id) {
    this.user2Id = user2Id;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
