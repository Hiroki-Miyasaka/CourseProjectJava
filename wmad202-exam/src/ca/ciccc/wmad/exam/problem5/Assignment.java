package ca.ciccc.wmad.exam.problem5;

import java.util.ArrayList;

public class Assignment extends Directory{

    private ArrayList<Directory> questions;

    public Assignment(String txt, String pdf, ArrayList<Directory> questions) {
        super(txt, pdf);
        this.questions = questions;
    }

    public ArrayList<Directory> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Directory> questions) {
        this.questions = questions;
    }
}
