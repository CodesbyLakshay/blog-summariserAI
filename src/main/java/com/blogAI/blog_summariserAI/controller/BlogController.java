package com.blogAI.blog_summariserAI.controller;

import com.blogAI.blog_summariserAI.model.Blog;
import com.blogAI.blog_summariserAI.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/blog")
    public Blog createBlog(@RequestBody Blog blog){
        return blogService.createBlog(blog);
    }

    @GetMapping
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs();
    }

    @GetMapping("/blog/{id}")
    public Blog getBlogById(@PathVariable Long id){
        return blogService.getBlogById(id);
    }

    @PutMapping("/blog/update")
    public Blog updateBlog(@RequestParam Long id , @RequestBody Blog blog){
        return blogService.updateBlog(id,blog);
    }

    @DeleteMapping("/blog/delete/{id}")
    public void deleteBlogById(@RequestParam Long id){
       blogService.deleteBlogById(id);
    }


}
