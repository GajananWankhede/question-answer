package com.med.question.service.services;

import com.med.question.service.DTO.QuestionDTO;
import com.med.question.service.assembler.QuestionAssembler;
import com.med.question.service.dao.QuestionRepository;
import com.med.question.service.entity.Question;
import com.med.question.service.globalexception.exception.QuestionNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    QuestionAssembler questionAssembler;



    public List<QuestionDTO> getAllQuestion() {
        ArrayList<QuestionDTO> randomList = new ArrayList<>();
        List<Question> questionEntityList = (List<Question>) questionRepository.findAll();

        List<QuestionDTO> questionDTOList = questionAssembler.convertEntityToDTO(questionEntityList);

        for(int i=0;i<3;i++) {
            Random rand = new Random();
            randomList.add(questionDTOList.get(rand.nextInt(questionDTOList.size())));
        }
        return randomList;
    }

    public QuestionDTO saveQuestion(QuestionDTO questionDTO){
        Question questionEntity  = questionAssembler.convertDTOToEntity(questionDTO);
        questionRepository.save(questionEntity);
        return  questionDTO;
    }

    public Question findById(Integer ID){

        return questionRepository.findById(ID)
                .orElseThrow(() -> new QuestionNotFoundException());
    }

    private void orElseThrow(Object o) {
    }

//    public Question getById(Integer questionId){
//
//        Question question = questionRepository.getById(questionId);
//        return question;
//    }

}
