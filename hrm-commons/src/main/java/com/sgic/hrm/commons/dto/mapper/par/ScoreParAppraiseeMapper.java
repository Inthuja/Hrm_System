package com.sgic.hrm.commons.dto.mapper.par;



import com.sgic.hrm.commons.dto.par.ScoreParAppraiseeDtoPost;
import com.sgic.hrm.commons.entity.par.ParContent;
import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;

public class ScoreParAppraiseeMapper {
	
	
	public static ScoreParAppraisee dtoToEntity(String pk,ParContent parContent,ScoreParAppraiseeDtoPost scoreParAppraiseeDtoPost ) {
		
		ScoreParAppraisee scoreParAppraisee =new ScoreParAppraisee();
		scoreParAppraisee.setId(pk);
		scoreParAppraisee.setParContent(parContent);
		scoreParAppraisee.setScore(scoreParAppraiseeDtoPost.getScore());
		return scoreParAppraisee;
		
	}

}
