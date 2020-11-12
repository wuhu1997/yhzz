package com.zl.controller;

import com.zl.bean.Question;
import com.zl.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @RequestMapping("/findall")
    public String findAns(String question) {
        String answer = questionService.findAnswer(question);
        if (answer==null){
            return "充钱解锁更多答案";
        }
        return answer;
    }
}

