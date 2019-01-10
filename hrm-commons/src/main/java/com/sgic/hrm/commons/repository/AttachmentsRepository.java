package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.Attachment;

public interface AttachmentsRepository extends JpaRepository<Attachment, Integer> {

}
