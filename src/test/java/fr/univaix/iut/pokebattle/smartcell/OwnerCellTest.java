package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.twitter.Tweet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cedric on 14/03/14.
 */
public class OwnerCellTest {
    OwnerCell test = new OwnerCell();

    @Test
    public void testOwner(){
        assertEquals("@PierreDresseur @PierreDresseur is my owner.", test.ask(new Tweet("PierreDresseur", "Owner ?")));
    }

    @Test
    public void testNotOwner(){
        assertEquals("Allakaazz Allakaazz !", test.ask(new Tweet("PierreDresseur", "Joke ?")));
    }
}
