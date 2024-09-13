package com.fitnessbook.fitnessbook.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userEnity {


    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private byte[] image;
}
