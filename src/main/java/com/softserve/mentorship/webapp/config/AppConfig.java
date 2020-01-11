package com.softserve.mentorship.webapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"com.softserve.mentorship.webapp"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.softserve.mentorship.webapp.controller"))
public class AppConfig {

}
