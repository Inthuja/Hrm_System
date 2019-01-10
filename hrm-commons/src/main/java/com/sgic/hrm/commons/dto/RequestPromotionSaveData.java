package com.sgic.hrm.commons.dto;

public class RequestPromotionSaveData {
	private Integer id;
	private Integer userId;
	private Integer designationId;
	private String promotionRemark;
	private String recommendedBy;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}
	public String getPromotionRemark() {
		return promotionRemark;
	}
	public void setPromotionRemark(String promotionRemark) {
		this.promotionRemark = promotionRemark;
	}
	public String getRecommendedBy() {
		return recommendedBy;
	}
	public void setRecommendedBy(String recommendedBy) {
		this.recommendedBy = recommendedBy;
	}
}
