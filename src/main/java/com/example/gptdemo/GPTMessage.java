package com.example.gptdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@JsonIgnoreProperties
@Data
@ToString
public class GPTMessage {
    private String role;
    private String content;
}
