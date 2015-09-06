package com.medicalproj.common.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.FileView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.service.IUploadService;


public class UploadController extends BaseController{
	@Autowired
	private IUploadService uploadService;
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	@ResponseBody
    public View<FileView> upload(@RequestParam("file") MultipartFile file) {
		View<FileView> view = uploadService.upload(file);
		return view;
    }
	
	/*@RequestMapping(value="/uploadImageOriginal", method=RequestMethod.POST)
	@ResponseBody
	public View<ImageView> uploadImageOriginal(@RequestParam("file") MultipartFile file){
		View<ImageView> view = imageUploadService.uploadImage(file);
		return view;
    }
	
	
	@RequestMapping(value="/uploadImageWith3Size", method=RequestMethod.POST)
	@ResponseBody
	public View<ImageView> uploadImageWith3Size(@RequestParam("file") MultipartFile file){
		View<ImageView> view = imageUploadService.uploadImageWith3Size(file);
		return view;
    }*/
	
}
