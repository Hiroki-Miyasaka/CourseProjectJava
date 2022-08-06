package ca.ciccc.wmad.project2.problem2;

import java.util.ArrayList;

public class Judge {

    private ArrayList<Transformer> autobots;
    private ArrayList<Transformer> deceptions;

    public Judge(ArrayList<Transformer> autobots, ArrayList<Transformer> deceptions) {
        this.autobots = autobots;
        this.deceptions = deceptions;
    }

    public void printInformationOfResult(){

        Battle b = new Battle();
        int battles = b.goToBattleAndCountBattles(autobots, deceptions);
        String theWinnerTeam = b.getTheWinnerTeamName();
        ArrayList<Transformer> theWinnerTeamList = b.getTheWinnerTeamList();
        System.out.println("The number of battles: " + battles);
        String winners = "";

        for(int i = 0; i < theWinnerTeamList.size(); i++){
            winners += theWinnerTeamList.get(i).getNameOfRobot() + " ";
        }

        System.out.println("(" + theWinnerTeam + "): " + winners);

    }



}
