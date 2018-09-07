package string.utility;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersModifierNotOkTest {
    public NumbersModifierNotOk forTest;

    @Before
    public void initialize() {
        forTest = new NumbersModifierNotOk();
    }

    @Test
    public void modifyNumbersTest() {
        forTest.setBefore("I have four apples");
        String result = "I have 4 apples";
        assertEquals(forTest.modifyNumbers(), result);
    }

    @Test
    public void modifyNumbersTest1() {
        forTest.setBefore("I want twenty-nine dollars");
        String result = "I want twenty-nine dollars";
        assertEquals(forTest.modifyNumbers(), result);
    }

    @Test
    public void modifyNumbersTest2() {
        forTest.setBefore("I want twenty nine dollars");
        String result = "I want twenty 9 dollars";
        assertEquals(forTest.modifyNumbers(), result);
    }


    @Test
    public void modifyNumbersTest3() {
        forTest.setBefore("Five six .SEVEN eiGHt!!");
        String result = "5 6 .7 8!!";
        assertEquals(forTest.modifyNumbers(), result);
    }
}


