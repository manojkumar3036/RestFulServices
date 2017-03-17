package com.techlook.mks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.techlook.mks")
public class WebAppConfig extends WebMvcConfigurerAdapter{
	
	@Bean 
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	


	/*@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
		
	}*/
	

}
