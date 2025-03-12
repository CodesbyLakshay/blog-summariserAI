package com.blogAI.blog_summariserAI.controller;

import com.blogAI.blog_summariserAI.model.Blog;
import com.blogAI.blog_summariserAI.repository.BlogRepository;
import com.blogAI.blog_summariserAI.service.AIService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/ai/summarize")
public class AIController {

    private final AIService aiService;
    private final BlogRepository blogRepository;

    public AIController(AIService aiService, BlogRepository blogRepository) {
        this.aiService = aiService;
        this.blogRepository = blogRepository;
    }

    @PostMapping("/{id}")
    public String getBlogSummary(@PathVariable Long id){
        Blog blog = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Blog not found"));
        return aiService.getBlogSummary(blog.getContent());
    }
}
