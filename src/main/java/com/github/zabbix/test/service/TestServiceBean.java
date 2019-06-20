package com.github.zabbix.test.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestServiceBean
{
	@Timed
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello!";
	}
}

