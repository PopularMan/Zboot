/**
 * Project:zboot-framework
 * File:EntityService.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zboot.framework.datamodel.Entity;
import org.zboot.framework.engine.EntityManager;;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 下午1:59:05
 */
@Service
public class EntityService {

	@Autowired
	private EntityManager entityManager;

	public Entity  create() {
		Entity entity = new Entity();
		entity.setProperty("name", "zcc");
		entity.setProperty("age", "22");
		entity.setType("xzxk");
		return entityManager.createEntity(entity);
	}

}
