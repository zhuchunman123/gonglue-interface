package com.springboot.gonglueinterface.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;

/**
* Create by Generate...
* Date: Wed Jul 28 11:48:07 CST 2021
* 
* @author fhrdr
*/
@Entity
@Table(name = "t_sort")
public class Sort {

	/**
	 * 分类id
	 */
	@Id
	private String id;
	/**
	 * 名称
	 */
	@Column(name = "name" )
	private String name;
	/**
	 * 序号
	 */
	@Column(name = "order" )
	private Long order;
	/**
	 * 图标地址
	 */
	@Column(name = "icon" )
	private String icon;
	/**
	 * 是否为首页
	 */
	@Column(name = "is_index" )
	private Boolean isIndex;
	/**
	 * 总共篇数
	 */
	@Column(name = "total" )
	private Long total;


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


  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public Boolean getIsIndex() {
    return isIndex;
  }

  public void setIsIndex(Boolean isIndex) {
    this.isIndex = isIndex;
  }


  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

}
