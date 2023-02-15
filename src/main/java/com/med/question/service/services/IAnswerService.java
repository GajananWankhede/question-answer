package com.med.question.service.services;

import com.med.question.service.entity.Answer;
import org.springframework.web.bind.annotation.PathVariable;

public interface IAnswerService {

    public Answer findById(Long id);
}
