package com.sgic.hrm.employee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sgic.hrm.commons.entity.ProfileAttachments;
import com.sgic.hrm.employee.service.ProfileAttachmentService;

@RestController
public class ProfileAttachmentController {
	@Autowired
	private ProfileAttachmentService profileAttachmentService;
	 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUploadForm(HttpServletRequest request) {
        return "Upload";
    }
     
    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String handleFileUpload(HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {
          
        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload){
                  
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                 
                ProfileAttachments profileAttachments= new ProfileAttachments();
                profileAttachmentService.save(profileAttachments);
                            
            }
        }
  
        return "Success";
    }  
}
