package com.sgic.hrm.commons.dto;

import java.sql.Date;



public class RequestPromotionData {
	private Integer id;
	private UserData userId;
	private DesignationData designationId;
	private String promotionRemark;
	private String recommendedBy;

	public String getRecommendedBy() {
		return recommendedBy;
	}

	public void setRecommendedBy(String recommendedBy) {
		this.recommendedBy = recommendedBy;
	}

	private Date createdAt;
	private Date updatedAt;

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public DesignationData getDesignationId() {
		return designationId;
	}

	public void setDesignationId(DesignationData designationId) {
		this.designationId = designationId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserData getUserId() {
		return userId;
	}

	public void setUserId(UserData userId) {
		this.userId = userId;
	}

	public String getPromotionRemark() {
		return promotionRemark;
	}

	public void setPromotionRemark(String promotionRemark) {
		this.promotionRemark = promotionRemark;
	}

}