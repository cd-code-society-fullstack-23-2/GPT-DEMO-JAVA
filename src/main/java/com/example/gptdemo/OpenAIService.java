package com.example.gptdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

@Service
@Slf4j
public class OpenAIService {

    @Value("${openai.api.key}")
    private String apiKey;

    public String getJoke() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);

        String prompt = "You are a developer starting a workshop on AI, and you want to start off with a joke to warm up the crowd. Come up with a Dad Joke.";

        String requestBody = "{\"model\":\"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\"" + prompt + "\"}]}";

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<GPTResponse> response = restTemplate.postForEntity("https://api.openai.com/v1/chat/completions", entity, GPTResponse.class);

        return extractJokeFromResponse(response.getBody());
    }

    private String extractJokeFromResponse(GPTResponse response) {
        // Parse the JSON response to extract the joke
        // This is a placeholder - use a JSON library like Jackson or Gson
        log.info(response.toString());
        return "Extracted Joke";
    }
}

