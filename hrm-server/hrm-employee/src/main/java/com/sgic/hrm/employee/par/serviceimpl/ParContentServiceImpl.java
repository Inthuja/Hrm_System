package com.sgic.hrm.employee.par.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.par.ParContent;
import com.sgic.hrm.commons.repository.par.ParContentRepository;
import com.sgic.hrm.employee.par.service.ParContentService;

@Service
public class ParContentServiceImpl implements ParContentService {

	@Autowired
	private ParContentRepository parContentRepository;

	@Override
	public List<ParContent> getParContent() {

		return parContentRepository.findAll();
	}

	@Override
	public void createParContent(ParContent parContent) {
		parContentRepository.save(parContent);

	}

	@Override
	public void updateParContent(ParContent parContent, String id) {
		ParContent existParContent = parContentRepository.getOne(id);

		if (existParContent.getId() != null) {
			parContent.setId(id);
			parContentRepository.save(parContent);
		}

	}

	@Override
	public void deleteParContent(String id) {
		parContentRepository.deleteById(id);
	}

	@Override
	public ParContent findParContentById(String id) {
		return parContentRepository.findParContentById(id);
	}

}
