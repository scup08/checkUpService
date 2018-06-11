package com.lzh.checkUpService.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value="/testb")
public class TestB {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(TestB.class);
	
	
	@RequestMapping(value="/showtest")
	public void showName1(){
//		logger.info("/testb+++++++++++++");
	}
}
