/**
 * Project:zboot-framework
 * File:Entity.java
 * Copyright 2004-2019 Homolo Co., Ltd. All rights reserved.
 */
package org.zboot.framework.datamodel;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.google.common.collect.Maps;

/**
 * @author　zhangchaochao
 * @date 2019年1月17日
 * @version 上午11:25:56
 */
@Document(collection="zboot.Entity")
public class Entity  implements Serializable{

	/** */
	private static final long serialVersionUID = 8252743983856277979L;

	@Field
	private String _id ;
	@Field
	private Date dateCreated;

	@Field
	private Date dateModified;

	@Field
	private Map<String,Object> properties;

	@Field
	private Map<String,Object> attributes;

	public Entity() {
		if(this.dateCreated==null) {
			this.dateCreated = new Date();
		}
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		if(this.properties==null) {
			this.properties = Maps.newHashMap();
		}
		this.properties = properties;
	}
	public void setProperty(String k ,Object v) {
		if(this.properties==null) {
			this.properties = Maps.newHashMap();
		}
		this.properties.put(k, v);
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		if(this.attributes==null) {
			this.attributes = Maps.newHashMap();
		}
		this.attributes = attributes;

	}
	public void setAttribute(String k ,Object v) {
		if(this.attributes==null) {
			this.attributes = Maps.newHashMap();
		}
		this.attributes.put(k, v);

	}




}
