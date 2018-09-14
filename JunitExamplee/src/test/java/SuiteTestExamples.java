import org.junit.*;

import static org.junit.Assert.assertEquals;


public class SuiteTestExamples {

    @Test
    public void testPrintMessage() {
        int num = 5;
        System.out.println("executing suitest 1");

        assertEquals(5, num);
    }


    @Test
    public void testPrintMessage2() {
        String hello = "Hello World";
        System.out.println("suite test 2 is executing");
        Assert.assertNotNull(hello);
        assertEquals("Hello World", hello);
    }

}
