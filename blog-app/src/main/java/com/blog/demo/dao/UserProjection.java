package com.blog.demo.dao;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "test",types = User.class)
public interface UserProjection {
	public String getFirstName();
	public String getLastName();
	
}
