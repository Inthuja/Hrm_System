package com.sgic.hrm.employee.par.service;

import java.util.List;

import com.sgic.hrm.commons.entity.par.ParContent;

public interface ParContentService {

	public List<ParContent> getParContent();

	public void createParContent(ParContent parContent);

	public void updateParContent(ParContent parContent, String id);

	public void deleteParContent(String id);
	
	public ParContent findParContentById(String id);

}
