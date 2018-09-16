import org.junit.*;

public class BasicAnnotationTest {
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@Before class - runOnceBeforeClass ");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@After class - runOnceAfterClass ");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@before - runBeforeTestMethod");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@after - runAfterTestMethod");
    }

    @Test

    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }


}
