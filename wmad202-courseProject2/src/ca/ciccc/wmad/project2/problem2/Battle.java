package ca.ciccc.wmad.project2.problem2;

import java.util.ArrayList;

public class Battle implements Rules{

    private Transformer autobot;
    private Transformer deception;

    public Battle(Transformer autobot, Transformer deception) {
        this.autobot = autobot;
        this.deception = deception;
    }

    @Override
    public int compareToCourageAndStrength(){
        if(autobot.getCourage() - deception.getCourage() >= 4 && autobot.getStrength() - deception.getStrength() >= 3){
            return 1;
        } else if(deception.getCourage() - autobot.getCourage() >= 4 && deception.getStrength() - autobot.getStrength() >= 3){
            return -1;
        } else{
            return 0;
        }
    }

    @Override
    public int compareToSkill(){
        if(autobot.getSkill() - deception.getSkill() >= 3){
            return 1;
        } else if(deception.getSkill() - autobot.getSkill() >= 3){
            return -1;
        } else{
            return 0;
        }
    }

    @Override
    public int compareToOverAllRating(){
        if(autobot.getOverAllRating() > deception.getOverAllRating()){
            return 1;
        } else if(deception.getOverAllRating() > autobot.getOverAllRating()){
            return -1;
        } else{
            return 0;
        }
    }

    @Override
    public int specialRules(){
        if(autobot.getNameOfRobot() == "Optimus Prime" || autobot.getNameOfRobot() == "Predaking"){
            return 1;
        } else if(deception.getNameOfRobot() == "Optimus Prime" || deception.getNameOfRobot() == "Predaking"){
            return -1;
        } else{
            return 0;
        }
    }
}

