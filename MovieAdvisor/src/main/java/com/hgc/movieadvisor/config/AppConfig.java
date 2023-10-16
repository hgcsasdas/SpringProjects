package com.hgc.movieadvisor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.hgc.movieadvisor")
@PropertySource("classpath:/movieadvisor.properties")
public class AppConfig {
	
	@Value("${file.path}")
	private String file;
	
	@Value("${file.csv.separator}")
	private String separator;
	
	@Value("${file.csv.list_separator}")
	private String listSeparator;

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public String getListSeparator() {
		return listSeparator;
	}

	public void setListSeparator(String listSeparator) {
		this.listSeparator = listSeparator;
	}

}
