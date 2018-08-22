package com.lzh.checkUpService.feignService;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.lzh.checkUpService.feignService.IFileManagementService.MultipartSupportConfig;
import com.lzh.common.model.dto.fastdfs.FastDto;
import com.lzh.common.model.dto.response.ObjectDataResponse;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;


@FeignClient(name="eurekaClientA",configuration = MultipartSupportConfig.class)
public interface IFileManagementService {
	/**
	 * 单一文件上传
	 * @param audioFile
	 */
	@RequestMapping(value="/upload/add",method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public ObjectDataResponse<String> addAudio(@RequestParam("audioFile") MultipartFile audioFile ,FastDto fastDto);
	public ObjectDataResponse<String> addAudio(@RequestPart("audioFile") MultipartFile audioFile 
			,@RequestParam("duration") Integer duration,@RequestParam("fileSize") Integer fileSize);
	

	@Configuration
    public class MultipartSupportConfig {
 
        @Autowired
        private ObjectFactory<HttpMessageConverters> messageConverters;
 
        @Bean
        @Primary
        @Scope("prototype")
        public Encoder feignEncoder() {
            return new SpringFormEncoder(new SpringEncoder(messageConverters));
        }
    }
}
