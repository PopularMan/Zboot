/**
 * Project:zboot-framework
 * File:Applicantion.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.zboot.framework.security.SpringSecurityConfig;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 下午2:36:39
 */
@SpringBootApplication
@Import(value= {SpringSecurityConfig.class})
public class Applicantion {

	public static void main(String[] args) {
		SpringApplication.run(Applicantion.class, args);
	}

}
