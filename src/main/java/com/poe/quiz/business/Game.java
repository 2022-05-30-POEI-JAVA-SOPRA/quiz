package com.poe.quiz.business;

import java.util.ArrayList;

public class Game {
    
    private ArrayList<Question> questions = new ArrayList<>();
    
    public Game() {
        
        Question question1 = new Question("Qui est le chanteur du groupe Queen ?");
        question1.addAnswer(new Answer("Mick Jagger", false));
        question1.addAnswer(new Answer("Freddie Mercury", true));
        question1.addAnswer(new Answer("Claude François", false));
        
        questions.add(question1);
    }
    
    
    public boolean validateAnswer(Long questionId, Long answerId){
        
        for(Question question : questions){
            if(question.getId().equals(questionId)){
                for(Answer answer : question.getAnswers()){
                    if(answer.getId().equals(answerId)){
                        return answer.isCorrectAnswer();
                    }
                }
            }
        }
        return false;
    }
    
}
