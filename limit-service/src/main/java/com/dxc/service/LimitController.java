package com.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.bean.LimitConfiguration;
import com.dxc.config.Configuration;

@RestController
public class LimitController {
	@Autowired
	private Configuration configuration;
	@GetMapping("/limit-service")
public LimitConfiguration getLimt() {
	return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
