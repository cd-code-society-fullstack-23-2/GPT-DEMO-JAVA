package com.example.gptdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties
@Data
@ToString
public class GPTResponse {
    private String id;
    private Date created;
    private List<GPTChoice> choices;
}
