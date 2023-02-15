package com.med.question.service.assembler;

import com.med.question.service.DTO.QuestionDTO;
import com.med.question.service.entity.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionAssembler {

    public List<QuestionDTO> convertEntityToDTO(List<Question> questionList){
        List<QuestionDTO> listDTO = new ArrayList<QuestionDTO>();
        for(int i=0; i<+questionList.size();i++) {

            QuestionDTO questionDTO = new QuestionDTO();
            Question questionEntity = questionList.get(i);

            questionDTO.setID(questionEntity.getID());
            questionDTO.setQuestionId(questionEntity.getQuestionId());
            questionDTO.setQuestionName(questionEntity.getQuestionName());
            questionDTO.setOptionOne(questionEntity.getOptionOne());
            questionDTO.setOptionTwo(questionEntity.getOptionTwo());
            questionDTO.setOptionThree(questionEntity.getOptionThree());
            questionDTO.setOptionFour(questionEntity.getOptionFour());
            questionDTO.setCorrectAnswer(questionEntity.getCorrectAnswer());


            listDTO.add(questionDTO);
        }
        return listDTO;
    }

    public QuestionDTO convertEntityToDTO(Question questionEntity){

            QuestionDTO questionDTO = new QuestionDTO();
            questionDTO.setID(questionEntity.getID());
            questionDTO.setQuestionId(questionEntity.getQuestionId());
            questionDTO.setQuestionName(questionEntity.getQuestionName());
            questionDTO.setOptionOne(questionEntity.getOptionOne());
            questionDTO.setOptionTwo(questionEntity.getOptionTwo());
            questionDTO.setOptionThree(questionEntity.getOptionThree());
            questionDTO.setOptionFour(questionEntity.getOptionFour());
            questionDTO.setCorrectAnswer(questionEntity.getCorrectAnswer());

            return questionDTO;
    }

    public Question convertDTOToEntity(QuestionDTO questionDTO){
        Question questionEntity = new Question();
        questionEntity.setID(questionDTO.getID());
        questionEntity.setQuestionId(questionDTO.getQuestionId());
        questionEntity.setQuestionName(questionDTO.getQuestionName());
        questionEntity.setOptionOne(questionDTO.getOptionOne());
        questionEntity.setOptionTwo(questionDTO.getOptionTwo());
        questionEntity.setOptionThree(questionDTO.getOptionThree());
        questionEntity.setOptionFour(questionDTO.getOptionFour());
        questionEntity.setCorrectAnswer(questionDTO.getCorrectAnswer());
        return questionEntity;
    }
}
