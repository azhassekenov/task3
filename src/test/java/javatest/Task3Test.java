package javatest;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by A.ZHASEKENOV on 10.10.2018.
 */
public class Task3Test {
    private Task3 task;
    @BeforeClass
    public static void beforeClass() {
        System.out.println(" Before Task3.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println(" After Task3.class");
    }

    @Before
    public void initTest() {
        task = new Task3();
    }

    @After
    public void afterTest() {
        task = null;
    }

    @Test
    public void testSummaVsehChisel() throws Exception {

        assertEquals((Object)"YES", (Object)task.yesOrNo("...XX.....\n" +
                "...X.OOOO.\n" +
                "...X......\n" +
                "..........\n" +
                "...X......\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                "..........\n" +
                ".........."));
    }
}