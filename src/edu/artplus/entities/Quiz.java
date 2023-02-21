/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.entities;
import edu.artplus.entities.Points;

/**
 *
 * @author nour
 */
public class Quiz {
    
	private int id_quiz;
	private String quiz_categorie;
	
	private String response_quiz;
	private String contenue_quiz;
	private String question_quiz;
	private Utilisateur user;
        
	
	public int getquiz_id() {
		return id_quiz;
	}
	public void setQuiz_id(int id_quiz) {
		this.id_quiz = id_quiz;
	}
	public String getQuiz_categorie() {
		return quiz_categorie;
	}
	public void setQuiz_categorie(String quiz_categorie) {
		this.quiz_categorie = quiz_categorie;
	}
	
	public String getQuiz_ask() {
		return response_quiz;
	}
	public void setQuiz_ask(String response_quiz) {
		this.response_quiz = response_quiz;
	}
	public String getQuiz_content() {
		return contenue_quiz;
	}
	public void setQuiz_content(String contenue_quiz) {
		this.contenue_quiz = contenue_quiz;
	}
	public String getQuiz_answer() {
		return question_quiz;
	}
	public void setQuiz_answer(String question_quiz) {
		this.question_quiz = question_quiz;
	}

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Quiz{" + "id_quiz=" + id_quiz + ", quiz_categorie=" + quiz_categorie + ", response_quiz=" + response_quiz + ", contenue_quiz=" + contenue_quiz + ", question_quiz=" + question_quiz + ", user=" + user + '}';
    }
    public void check_answer(String rep_choisie,int nbr_p ){
    if (rep_choisie.equals("1")) {
        System.out.println("Vous avez gagné");
                nbr_p++;
} else if (rep_choisie.equals("0")) {
        System.out.println("GameOver");
           nbr_p -= 5;
}
 
            
}
	
	
	
}
    

