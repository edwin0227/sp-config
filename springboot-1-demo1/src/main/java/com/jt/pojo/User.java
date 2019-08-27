package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
//实体类属性，需要使用包装类型
//tomcat运行服务器中，不需要安装lombok插件-----tomcat服务器运行时，加载。class文件信息
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)  //连续操作对象
public class User {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	
}
 