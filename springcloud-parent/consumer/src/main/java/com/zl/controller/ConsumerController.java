package com.zl.controller;

import com.zl.feign.QuestionFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class ConsumerController {
    @Autowired
    private QuestionFeign questionFeign;
    @RequestMapping("/question")
    public String findAns(String question) {
        String ans = questionFeign.findAns(question);
        System.out.println("1111");
        return ans;
    }
}
