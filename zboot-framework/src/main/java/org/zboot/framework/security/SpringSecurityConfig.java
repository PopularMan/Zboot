/**
 * Project:zboot-framework
 * File:SpringSecurityConfig.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 下午4:35:30
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
		http.formLogin().permitAll();
	}

}
