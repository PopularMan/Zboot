/**
 * Project:zboot-framework
 * File:EntityAction.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zboot.framework.datamodel.Entity;
import org.zboot.framework.service.EntityService;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 下午2:05:10
 */

@RestController
@RequestMapping("/api")
public class EntityAction {

	@Autowired
	EntityService entityService;

    @RequestMapping("/create")
	public Entity create() {
		return entityService.create();

    }

}
