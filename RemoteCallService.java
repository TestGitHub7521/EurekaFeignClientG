package com.fedex;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="eurekaserviceg")
public interface RemoteCallService {
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String sayHello();

}
