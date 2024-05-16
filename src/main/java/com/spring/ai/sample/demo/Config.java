package com.spring.ai.sample.demo;

import org.springframework.ai.bedrock.llama2.BedrockLlama2ChatClient;
import org.springframework.ai.bedrock.llama2.BedrockLlama2ChatOptions;
import org.springframework.ai.bedrock.llama2.api.Llama2ChatBedrockApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("app.llama2.model.id")
    private String llamaModelId;
    @Value("app.llama2.model.region")
    private String llama2Region;

    public BedrockLlama2ChatClient getBedrockLlama2ChatClient(){

        BedrockLlama2ChatOptions bedrockLlama2ChatOptions= BedrockLlama2ChatOptions
                                                                .builder()
                                                                .withTemperature(0.7f)
                                                                .withTopP(0.9f)
                                                                .withMaxGenLen(100)
                                                                .build();
        Llama2ChatBedrockApi llama2ChatBedrockApi=new Llama2ChatBedrockApi(llamaModelId,llama2Region);
        return new BedrockLlama2ChatClient(llama2ChatBedrockApi,bedrockLlama2ChatOptions);
        }
    }

