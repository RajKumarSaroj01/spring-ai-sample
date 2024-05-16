package com.spring.ai.sample.demo;


import org.springframework.ai.bedrock.llama2.BedrockLlama2ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/bedrock/ai")
public class BedrockController {

    @Autowired
    private  BedrockLlama2ChatClient chatClient;

    @GetMapping("/chat")
    public Map generate(@RequestParam(value = "message", defaultValue = "Hi") String message) {
        return Map.of("generation", chatClient.call(message));
    }

}
