package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.twitter.Tweet;

/**
 * Created by Cédric on 14/03/14.
 */
public class OwnerCell implements SmartCell {

    @Override
    public String ask(Tweet question) {
        String text = question.getText();
        if (text.contains("Owner ?")){
            return "@" + question.getScreenName() + " " + "@PierreDresseur" + " is my owner." ;
        }
        return "Allakaazz Allakaazz !";
    }
}
