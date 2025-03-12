package com.blogAI.blog_summariserAI.service;

import com.blogAI.blog_summariserAI.model.Blog;
import com.blogAI.blog_summariserAI.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }
    public List<Blog> getAllBlogs(){
        return blogRepository.findAll();
    }

    public Blog getBlogById(Long id) {
        return blogRepository.findById(id).orElseThrow(() -> new RuntimeException("Blog not found"));
    }

    public Blog updateBlog(Long id, Blog blogdetails) {
        Blog blog = getBlogById(id);
        blog.setTitle(blogdetails.getTitle());
        blog.setAuthor(blogdetails.getAuthor());
        blog.setContent(blogdetails.getContent());
        return blogRepository.save(blog);
    }

    public void deleteBlogById(Long id) {
        blogRepository.deleteById(id);
    }
}
