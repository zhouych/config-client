package com.zyc.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

	@Value("${version}")
    private String version;

	@RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
		return this.version;
    }
}
