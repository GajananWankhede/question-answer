package com.med.question.service.controller;

import com.med.question.service.DTO.QuestionDTO;
import com.med.question.service.entity.Question;
import com.med.question.service.globalexception.exception.QuestionNotFoundException;
import com.med.question.service.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("med-question-service")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "/getQuestionById/{ID}")
    public Question getQuestionById(@PathVariable Integer ID){
        Question questionEntity = questionService.findById(ID);
//        try{
//            if(questionDTO == null){
//                throw new QuestionNotFoundException();
//            }
//        }catch(QuestionNotFoundException q){
//            q.getMessage();
//        }
        return questionEntity;
    }

    @PostMapping(value = "/saveQuestion", consumes = MediaType.APPLICATION_JSON_VALUE,
                                             produces = MediaType.APPLICATION_JSON_VALUE)
    public QuestionDTO saveQuestion(@RequestBody QuestionDTO questionDTO){
        return questionService.saveQuestion(questionDTO);
    }
//    @GetMapping("getById/{questionId}")
//    public Question getById(@PathVariable("questionId")Integer questionId){
//        Question questionEntity = questionService.getQuestionById(questionId);
//        return questionEntity;
//    }

    @GetMapping("getAllQuestion")
    public List<QuestionDTO> getAllQuestion(){
        List<QuestionDTO> questionDTOList = questionService.getAllQuestion();
        return questionDTOList;
    }

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to JAVA";
    }
}
