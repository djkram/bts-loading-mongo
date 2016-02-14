package com.bts.ingestion.filter;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class DBExistMessageSelector implements MessageSelector {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public boolean accept(Message<?> message) {
		
//		Query query = new Query();
//		query.addCriteria(Criteria.where("name").is("Eric"));
//		List<User> users = mongoTemplate.exists(query, entityClass).find(query, User.class);
		
		// TODO Auto-generated method stub
		return false;
	}

}
