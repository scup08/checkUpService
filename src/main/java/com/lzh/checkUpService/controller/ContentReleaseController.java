package com.lzh.checkUpService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lzh.checkUpService.feignService.IFileManagementService;
import com.lzh.common.model.dto.fastdfs.FastDto;
import com.lzh.common.model.dto.response.ObjectDataResponse;

/**
 * 内容发布服务
 * @author 
 */
@RestController
@RequestMapping(value = "/release", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class ContentReleaseController {

	@Autowired
	private IFileManagementService fileManagementService;
	
	
    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
    public ObjectDataResponse<String> findUser( @RequestPart("audioFile") MultipartFile audioFile , FastDto fastDto) {
    	
    	ObjectDataResponse<String> rs = new ObjectDataResponse<String>("");
    	
    	//上s传文件，返回存储路径
    	ObjectDataResponse<String> odp = fileManagementService.addAudio(audioFile,fastDto.getDuration(),fastDto.getFileSize());
    	String path = odp.getData();
        
    	//保存上传记录
    	
    	rs.setData(path);
    	return rs;
    }



}
