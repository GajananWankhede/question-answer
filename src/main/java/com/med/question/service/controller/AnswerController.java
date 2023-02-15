package com.med.question.service.controller;


import com.med.question.service.entity.Answer;
import com.med.question.service.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/med-answer-services")
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @GetMapping(value = "/answer/{id}")
    public Answer getAnswerById(@PathVariable Long id) {

        return answerService.findById(id);
    }

}
