package com.lzh.checkUpService.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzh.common.model.dto.response.ObjectCollectionResponse;
import com.lzh.common.model.entity.account.TAccountUser;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value="/testa")
@RefreshScope
public class TestA {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(TestA.class);
	
	
	
	@RequestMapping(value="/showName")
	public String showName(String name){
		
		
//		Map creds = new ObjectMapper().readValue("",  Map.class);
//		return "";
		return " mynameis ------------------";
	}
	
	@RequestMapping(value="/showtest")
	public void showName1(){
		logger.info("str1++++++++");
	}
}
