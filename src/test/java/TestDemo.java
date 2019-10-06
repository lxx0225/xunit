import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDemo {
    @BeforeClass
    public static void   beforeAllTestCasse(){
        System.out.println("beforeAllTstCase");
    }
    @AfterClass
    public  static  void afterAllTestCase(){
        System.out.println("afterAllTestCase");
    }
    @Before
    public  void beforeTestCase(){
        System.out.println("i am @before");
    }
    @After
    public void afterTestCase(){
        System.out.println("i am @after");
    }


    @Test
    public void testDemo3(){
        System.out.println("testDemo3");
        assertTrue(false);
    }
    @Test
    public void testDemo1(){
        System.out.println("testDemo1");
        assertTrue(true);

    }
    @Test
    public void testDemo2(){
        System.out.println("testDemo2");
        assertTrue(false);
    }

}
