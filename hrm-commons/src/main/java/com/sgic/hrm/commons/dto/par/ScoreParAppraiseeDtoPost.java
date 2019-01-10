package com.sgic.hrm.commons.dto.par;

public class ScoreParAppraiseeDtoPost {
	
	private String parContentId;
	private Double score;

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
	public  ScoreParAppraiseeDtoPost(String parContentId, Double score) {
	this .parContentId = parContentId;
	this.score= score;
}
	public ScoreParAppraiseeDtoPost() {
	}
}
