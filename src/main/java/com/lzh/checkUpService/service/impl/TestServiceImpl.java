package com.lzh.checkUpService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lzh.checkUpService.service.ITestService;


@Service
public class TestServiceImpl implements ITestService {

	
	@Override
	@Transactional
	public int addTestInfoA() {
//		TTestUser testUser = new TTestUser();
//		testUser.setMobile("AAAA");
		int rs =0;
		return rs;
	}

	@Override
	public int addTestInfoB() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTestInfoC() {
		// TODO Auto-generated method stub
		return 0;
	}


}
