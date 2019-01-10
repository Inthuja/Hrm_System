package com.sgic.hrm.commons.dto.par;

public class ScoreParAppraiserDtoPost {

	private String parContentId;
	private Double score;

	public ScoreParAppraiserDtoPost(String parContentId, Double score) {
		this.parContentId = parContentId;
		this.score = score;
	}

	public ScoreParAppraiserDtoPost() {

	}

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
