package com.blog.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentRepository  extends JpaRepository<PostComment, Long> {

}
