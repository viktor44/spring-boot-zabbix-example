package com.github.zabbix.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication(scanBasePackages={ "com.github.zabbix.test.service" })
public class App
{

	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
	}

	@Bean
	public TimedAspect timedAspect(MeterRegistry registry)
	{
		return new TimedAspect(registry);
	}
}
