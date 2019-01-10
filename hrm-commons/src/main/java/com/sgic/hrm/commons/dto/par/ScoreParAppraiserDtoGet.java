package com.sgic.hrm.commons.dto.par;

public class ScoreParAppraiserDtoGet {

	private String parContentId;
	private String parContentName;
	private Double score;

	public ScoreParAppraiserDtoGet(String parContentId, String parContentName, Double score) {
		this.parContentId = parContentId;
		this.parContentName = parContentName;
		this.score = score;
	}

	public ScoreParAppraiserDtoGet() {

	}

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public String getParContentName() {
		return parContentName;
	}

	public void setParContentName(String parContentName) {
		this.parContentName = parContentName;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
