package com.med.question.service.services;

import com.med.question.service.dao.AnswerRepository;
import com.med.question.service.entity.Answer;
import com.med.question.service.globalexception.exception.AnswerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService implements IAnswerService{

    @Autowired
    AnswerRepository answerRepository;

//    public Optional<Answer> findById(Long id) {
//        Optional<Answer> AnswerEntity = answerRepository.findById(id);
//        try{
//            if(AnswerEntity == null){
//                throw new AnswerNotFoundException(id);
//            }
//        }catch(AnswerNotFoundException q){
//            q.getMessage();
//        }
//       return AnswerEntity;
//      }


    @Override
    public Answer findById(Long id) {

        return answerRepository.findById(id)
                .orElseThrow(() -> new AnswerNotFoundException(id));
    }


}
