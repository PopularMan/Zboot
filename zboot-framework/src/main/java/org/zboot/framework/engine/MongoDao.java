/**
 * Project:zboot-framework
 * File:MongoDao.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 上午11:20:46
 */
@Repository
public class MongoDao {
	@Autowired
	private MongoTemplate mongoTemplate;

	public <T> T create(T t){
		return mongoTemplate.insert(t);
	}
}
