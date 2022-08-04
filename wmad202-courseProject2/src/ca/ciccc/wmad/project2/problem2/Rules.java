package ca.ciccc.wmad.project2.problem2;

import java.util.ArrayList;

public interface Rules {
    public String compareToCourageAndStrength(Transformer autobot, Transformer deception);
    public String compareToOtherSkills(Transformer autobot, Transformer deception);
    public String compareToOverAllRating(Transformer autobot, Transformer deception);
    public String specialRules(Transformer autobot, Transformer deception);
}
