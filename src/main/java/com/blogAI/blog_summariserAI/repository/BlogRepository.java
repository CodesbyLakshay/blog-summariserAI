package com.blogAI.blog_summariserAI.repository;

import com.blogAI.blog_summariserAI.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {
}
