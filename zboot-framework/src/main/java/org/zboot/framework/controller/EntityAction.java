/**
 * Project:zboot-framework
 * File:EntityAction.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zboot.framework.datamodel.Entity;
import org.zboot.framework.engine.EntityManager;
import org.zboot.framework.service.EntityService;

/**
 * @author zhangchaochao
 * @date 2019年1月17日
 * @version 下午2:05:10
 */

@RestController
@RequestMapping("/api")
public class EntityAction {

	@Autowired
	EntityService entityService;

	@Autowired
	EntityManager entiyManager;

	@RequestMapping("/create")
	public Entity create() {
		return entityService.create();

	}
	@RequestMapping("/list")
	public Object list() {
		List<Entity> list =  entiyManager.list("xzxk");
		return list;

	}

}
