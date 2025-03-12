package com.blogAI.blog_summariserAI.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final OpenAiChatModel openAiChatModel;


    public AIService(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }


   // public String getBlogSummary(String content) {
     //   if (content == null || content.isEmpty()) {
     //       throw new IllegalArgumentException("Blog Content is Empty");
       // }
       // String prompt = "Summarize the following text:\n" + content;
       // return openAiChatModel.call(prompt);
   // }

    public String testAI(String prompt) {
        return openAiChatModel.call(prompt);
    }
}
