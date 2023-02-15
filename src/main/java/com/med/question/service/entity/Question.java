package com.med.question.service.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "Question", uniqueConstraints = { @UniqueConstraint(columnNames = { "questionName" })})
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer ID;

    @NonNull
    private Integer questionId;
    @NonNull
    private String questionName;
    @NonNull
    private String correctAnswer;
    @NonNull
    private String optionOne;
    @NonNull
    private String optionTwo;
    @NonNull
    private String optionThree;
    @NonNull
    private String optionFour;

    public Question(Integer iD,Integer questionId,String questionName, String correctAnswer, String optionOne, String optionTwo, String optionThree, String optionFour) {
        ID =iD;
        this.questionId =  questionId;
        this.questionName = questionName;
        this.correctAnswer = correctAnswer;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
    }
    //commit

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Question() {

    }

    public Integer getQuestionId() {
        return questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }
}
