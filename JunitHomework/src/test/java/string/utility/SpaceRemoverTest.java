package string.utility;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SpaceRemoverTest {
    public SpaceRemover string = new SpaceRemover ();

    @Before
    public void initialize(){
        string = new SpaceRemover ();
    }

    @Test
    public void removeSpacesTest() {
        string = new SpaceRemover();
        string.setBefore("Ana Are Mere Primite               Cadou ///S+ss De La Bunica");
        String testString = "AnaAreMerePrimiteCadou///S+ssDeLaBunica";
        assertEquals(testString, string.removeSpaces());
    }

    @Test
    public void removeSpacesTest2() {
        string = new SpaceRemover();
        string.setBefore(" 2 Fete Se Plimbau !@#$ Aievea ");
        String testString = "2FeteSePlimbau!@#$Aievea";
        assertEquals(testString, string.removeSpaces());
    }
}