package com.sgic.hrm.commons.repository.par;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.par.ParContent;

public interface ParContentRepository extends JpaRepository<ParContent,String>{

	ParContent findParContentById(String id);
}

