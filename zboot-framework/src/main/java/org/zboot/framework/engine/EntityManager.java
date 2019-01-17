/**
 * Project:zboot-framework
 * File:MongoDao.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.engine;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.zboot.framework.datamodel.Entity;
import org.zboot.framework.setup.Config;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 上午11:20:46
 */
@Repository
public class EntityManager{

	@Autowired
	private MongoTemplate mongoTemplate;

	public Entity  createEntity(Entity entity){
		if(entity!=null && !StringUtils.isBlank(entity.getType())) {
			mongoTemplate.insert(entity,entity.getType());
			return entity;
		}else {
			return null;
		}
	}
	public  Object deleteEntity(String id){
		Query query = Query.query(Criteria.where("_id").is(id));
		return mongoTemplate.remove(query, Entity.class);
	}
	public Entity  findEntityById(String id){
		return mongoTemplate.findOne(new Query().query(Criteria.where("_id").is(id)), Entity.class);
	}
	public List<Entity> list(String type){
		return mongoTemplate.find(new Query(), Entity.class, getCollectionName(type));
	}
	public String getCollectionName(String type) {
		if(StringUtils.isBlank(type)) {
			return Config.COLLECTION_PREFIX;
		}
		return Config.COLLECTION_PREFIX+"#"+type;
	}
}
