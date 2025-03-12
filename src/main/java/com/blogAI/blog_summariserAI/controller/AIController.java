package com.blogAI.blog_summariserAI.controller;

import com.blogAI.blog_summariserAI.model.Blog;
import com.blogAI.blog_summariserAI.repository.BlogRepository;
import com.blogAI.blog_summariserAI.service.AIService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/summary")
public class AIController {

    private final AIService aiService;
    private final BlogRepository blogRepository;

    public AIController(AIService aiService, BlogRepository blogRepository) {
        this.aiService = aiService;
        this.blogRepository = blogRepository;
    }

    @GetMapping
    public String testAI(@RequestParam String prompt) {
        return aiService.testAI(prompt);
    }

  //  @GetMapping("/{id}")
  //  public String getBlogSummary(@PathVariable Long id){
   //     Blog blog = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Blog not found"));
    //    return aiService.getBlogSummary(blog.getContent());
    }

