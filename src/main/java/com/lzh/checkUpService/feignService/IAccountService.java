package com.lzh.checkUpService.feignService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="account")
public interface IAccountService {

//	@RequestMapping(value="/accountTest/testInfo",method=RequestMethod.POST)
//	public void testInfo(@RequestParam(value = "aa")String aa);
}
