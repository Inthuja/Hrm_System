package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScoreParAppraiserDtoPost;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisor;

public class ScoreParAppraiserMapper {
	public static ScoreParAppraisor dtoToEntity(String pk, ScoreParAppraiserDtoPost scoreParAppraiserDtoPost) {

		ScoreParAppraisor scoreParAppraiser = new ScoreParAppraisor();
		scoreParAppraiser.setId(pk);
		//scoreParAppraiser.setParContentId(scoreParAppraiserDtoPost.getParContentId());
		scoreParAppraiser.setScore(scoreParAppraiserDtoPost.getScore());
		return scoreParAppraiser;

	}
}
