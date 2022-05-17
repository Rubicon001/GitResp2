package com.al.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("person")
@Data
public class Person {
    int id;
    int age;
    String name;
    String[] nikeName;
    Map<String, String> map;
    Dog dog;
    List<Dog> dogs;

    @Data
    public static class Dog{
        int age;
        String name;
    }
}
