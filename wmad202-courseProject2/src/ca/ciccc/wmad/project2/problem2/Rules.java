package ca.ciccc.wmad.project2.problem2;

import java.util.ArrayList;

public interface Rules {
    public int compareToCourageAndStrength(Transformer autobot, Transformer deception);
    public int compareToSkill(Transformer autobot, Transformer deception);
    public int compareToOverAllRating(Transformer autobot, Transformer deception);
    public int specialRules(Transformer autobot, Transformer deception);
}
