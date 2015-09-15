package com.medicalproj.common.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.medicalproj.common.dto.view.FileView;
import com.medicalproj.common.dto.view.View;
import com.medicalproj.common.service.IUploadService;


@RequestMapping("/")
@Controller
public class UploadController extends BaseController{
	@Autowired
	private IUploadService uploadService;
	
	@RequestMapping(value="/upload", method = RequestMethod.POST)
	@ResponseBody
    public View<FileView> upload(@RequestParam("file") MultipartFile file) {
		View<FileView> view = uploadService.upload(file);
		return view;
    }
	
   /* @RequestMapping(value="/upload1", method = RequestMethod.POST)
    public @ResponseBody LinkedList<FileMeta> upload(MultipartHttpServletRequest request, HttpServletResponse response) {
 
        //1. build an iterator
         Iterator<String> itr =  request.getFileNames();
         MultipartFile mpf = null;
 
         //2. get each file
         while(itr.hasNext()){
 
             //2.1 get next MultipartFile
             mpf = request.getFile(itr.next()); 
             System.out.println(mpf.getOriginalFilename() +" uploaded! "+files.size());
 
             //2.2 if files > 10 remove the first from the list
             if(files.size() >= 10)
                 files.pop();
 
             //2.3 create new fileMeta
             fileMeta = new FileMeta();
             fileMeta.setFileName(mpf.getOriginalFilename());
             fileMeta.setFileSize(mpf.getSize()/1024+" Kb");
             fileMeta.setFileType(mpf.getContentType());
 
             try {
                fileMeta.setBytes(mpf.getBytes());
 
                 // copy file to local disk (make sure the path "e.g. D:/temp/files" exists)            
                 FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream("D:/temp/files/"+mpf.getOriginalFilename()));
 
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             //2.4 add to files
             files.add(fileMeta);
         }
        // result will be like this
        // [{"fileName":"app_engine-85x77.png","fileSize":"8 Kb","fileType":"image/png"},...]
        return files;
    }*/
    
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
