package com.sk.intensive.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


@Component
@Primary
@EnableAutoConfiguration
public class ApiController implements SwaggerResourcesProvider {

	@Override
	public List get() {
		List resources = new ArrayList<>();		
		resources.add(swaggerResource("library-member", "/member/v2/api-docs","2.0"));
		resources.add(swaggerResource("library-book", "/activity/v2/api-docs","2.0"));
		resources.add(swaggerResource("library-rental", "/rental/v2/api-docs","2.0"));
		resources.add(swaggerResource("library-notice", "/notice/v2/api-docs","2.0"));
		return resources;
	}

	private SwaggerResource swaggerResource(String name, String location, String version) {
		    SwaggerResource swaggerResource = new SwaggerResource();
	        swaggerResource.setName(name);
	        swaggerResource.setLocation(location);
	        swaggerResource.setSwaggerVersion(version);
	        return swaggerResource;
	}
}
