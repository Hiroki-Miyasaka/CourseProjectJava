package ca.ciccc.wmad.project2.problem2;

import java.util.ArrayList;

public class Judge {

    private ArrayList<Transformer> autobots;
    private ArrayList<Transformer> deceptions;

    public Judge(ArrayList<Transformer> autobots, ArrayList<Transformer> deceptions) {
        this.autobots = autobots;
        this.deceptions = deceptions;
    }

    public int getTheNumberOfBattles(){
        if(autobots.size() >= deceptions.size()){
            return deceptions.size();
        }
        return autobots.size();
    }

    public String goToBattle(){

    }

}
