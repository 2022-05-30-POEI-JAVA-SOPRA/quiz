package com.poe.quiz.api;

import com.poe.quiz.business.Game;
import com.poe.quiz.business.Question;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("questions")
public class QuizApi {
    
    
    @GET()
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Question> getQuestions() {
        
        Game game = new Game();
        return game.getStore().getQuestions();
    }
}
