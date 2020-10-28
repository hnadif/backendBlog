package com.blog.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blog.demo.dao.Post;
import com.blog.demo.dao.PostComment;
import com.blog.demo.dao.PostCommentRepository;
import com.blog.demo.dao.PostRepository;
import com.blog.demo.dao.User;
import com.blog.demo.dao.UserRepository;

@SpringBootApplication
public class BlogAppApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
    
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	public PostCommentRepository postCommentRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User("hamza", "nadif", "hnad", "admin123", "hn.hamzanadif@gmail.com");
		User user2 = new User("kelley", "alejandra", "kal", "admin123", "kelly@gmail.com");
		User user3 = new User("guerra", "matallana", "gmat", "admin123", "matallana@gmail.com");
		
//		Post post1 = new Post("Angular cours", "for test" ,"foto", new Date());
		Post post2 = new Post("Java cours", "for test" ,"foto", new Date());
//		Post post3 = new Post("JPA cours", "for test" ,"foto", new Date());
		
	   PostComment postComment1 = new PostComment("review 3 for post2", post2);
	   PostComment postComment2 = new PostComment("review 4 for post2", post2);
	   
	   
	   post2.addPostComment(postComment1);
	   post2.addPostComment(postComment2);
	   user2.addPost(post2);
	   userRepository.save(user2);
	   postRepository.save(post2);
	   postCommentRepository.save(postComment1);
	   postCommentRepository.save(postComment2); 
		
		
 
       System.out.println("** post the user ");
       postRepository.findAll().stream().filter(p -> p.getUser().getId() == 1l).forEach(p -> {
    	   System.out.println(p);
       });
       System.out.println();
       System.out.println("** postComment the post ");
       postCommentRepository.findAll().stream().filter(p -> p.getPost().getId() == 2l).forEach(p -> {
    	   System.out.println(p);
       });
	   

//		System.out.println("**** save users *****");
//		userRepository.save(user1);
//		userRepository.save(user2);
//		userRepository.save(user3);
//		System.out.println("**** showing list of users ****");
//		userRepository.findAll().forEach(x -> System.out.println(x));
//		System.out.println("************** Commentaire***************");
//		commentRepository.save(new Post("Angular MAterial UI", "While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it:While weighing our design options, we decided that we preferred a more realistic view of the components instead of abstract representations. This is  where we came up with the idea of creating “scenes” for each component  and capturing them as they would appear in use. We needed a way to  efficiently capture these components. We turned to a technique called  screenshot testing. Screenshot testing is a technique that captures an image  of the page of the provided url and compares it to an expected image. Using  this technique we were able to generate the scenes for all 35 components. Here’s how we did it: ", "image", new Date()));
//        
	}

}
