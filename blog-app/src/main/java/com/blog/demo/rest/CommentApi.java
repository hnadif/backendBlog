package com.blog.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.demo.dao.Post;
import com.blog.demo.dao.PostRepository;

@RestController
@CrossOrigin("*")
public class CommentApi {

	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping(value = "/posts",method = RequestMethod.GET)
	public List<Post> getComments(){
		return postRepository.findAll();
	}
	
	
	@RequestMapping(value = "/posts",method = RequestMethod.POST)
	public Post addComment(@RequestBody Post comment){
		return postRepository.save(comment);
	}
	
	
}
