package com.zyc.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

	@Value("${demo}")
    private String demo;
	
    public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
		return this.getDemo();
    }
}
