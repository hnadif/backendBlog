package com.blog.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.blog.demo.dao.Post;
import com.blog.demo.dao.PostComment;
import com.blog.demo.dao.PostCommentRepository;
import com.blog.demo.dao.PostRepository;
import com.blog.demo.dao.User;
import com.blog.demo.dao.UserRepository;

@SpringBootApplication
public class BlogAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository userRepository, PostRepository postRepository,
			PostCommentRepository postCommentRepository, RepositoryRestConfiguration restconfiguration) {
		return args -> {
			restconfiguration.exposeIdsFor(User.class);
			User user1 = new User("hamza", "nadif", "hnad", "admin123", "hn.hamzanadif@gmail.com");
			User user2 = new User("kelley", "alejandra", "kal", "admin123", "kelly@gmail.com");
			User user3 = new User("guerra", "matallana", "gmat", "admin123", "matallana@gmail.com");
			User user4 = new User("kaka", "baba", "gmat", "admin123", "matallana@gmail.com");

			Post post1 = new Post("Angular cours", "for test", "foto", new Date());
			Post post2 = new Post("Java cours", "for test", "foto", new Date());
			Post post3 = new Post("JPA cours", "for test", "foto", new Date());
			Post post4 = new Post("DOCKER", "para practicar", "foto", new Date());

			PostComment postComment1 = new PostComment("review 3 for post2", post2);
			PostComment postComment2 = new PostComment("review 4 for post2", post2);
			PostComment postComment3 = new PostComment("review 5 for post1", post1);
			PostComment postComment4 = new PostComment("review 6 for post3", post3);
			PostComment postComment5 = new PostComment("review 7 for post4", post4);

			post2.addPostComment(postComment1);
			post2.addPostComment(postComment2);
			post1.addPostComment(postComment3);
			post3.addPostComment(postComment4);
			post4.addPostComment(postComment5);

			user2.addPost(post2);
			userRepository.save(user2);
			user2.addPost(post4);
			userRepository.save(user2);
			user3.addPost(post1);
			user1.addPost(post3);

			userRepository.save(user1);
			userRepository.save(user3);

			postRepository.save(post1);
			postRepository.save(post2);
			postRepository.save(post3);
			postRepository.save(post4);

			postCommentRepository.save(postComment1);
			postCommentRepository.save(postComment2);
			postCommentRepository.save(postComment3);
			postCommentRepository.save(postComment4);
		};
	}

}
