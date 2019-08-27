package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ConfigurationProperties(prefix = "jdbc")
@PropertySource("classpath:/properties/jdbc.properties")
public class JDBCController {
	
	    private String driver;
		private String name;
		private String password;
		@Override
		public String toString() {
			return "JDBCController [driver=" + driver + ", name=" + name + ", password=" + password + "]";
		}
		public String getDriver() {
			return driver;
		}
		public void setDriver(String driver) {
			this.driver = driver;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}   
		public void setPassword(String password) {
			this.password = password;
		}
/**
@Value(value="${jdbc.driver}")
	private String driver;
@Value(value="${jdbc.name}")
	private String name;
@Value(value="${jdbc.password}")
	private String password;
	*/
@RequestMapping("/getMsg")
@ResponseBody
public String getMsg() {
	return "获取信息："+driver+" & "+name+" & "+password;
	
}
}
