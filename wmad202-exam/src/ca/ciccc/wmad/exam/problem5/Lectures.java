package ca.ciccc.wmad.exam.problem5;

import java.util.ArrayList;

public class Lectures extends Directory {

    private ArrayList<Directory> examples;

    public Lectures(String txt, String pdf, ArrayList<Directory> examples) {
        super(txt, pdf);
        this.examples = examples;
    }

    public ArrayList<Directory> getExamples() {
        return examples;
    }

    public void setExamples(ArrayList<Directory> examples) {
        this.examples = examples;
    }
}
