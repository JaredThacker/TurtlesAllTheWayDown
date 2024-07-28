import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void factorialTest1(){
        Turtles turtles = new Turtles();
        Assert.assertEquals(120,turtles.factorial(5));
    }

    @Test
    public void factorialTest2(){
        Turtles turtles = new Turtles();
        Assert.assertEquals(3628800, turtles.factorial(10));
    }

    @Test
    public void factorialTest3(){
        Turtles turtles = new Turtles();
        Assert.assertEquals(5040, turtles.factorial(7));
    }

    @Test
    public void gcdTest1(){
        Turtles turtles = new Turtles();
        Assert.assertEquals(24, turtles.gcd(1440, 408));
    }

    @Test
    public void gcdTest2(){
        Turtles turtles = new Turtles();
        Assert.assertEquals(24, turtles.gcd(408, 216));
    }

    @Test
    public void lcsTest(){
        Turtles turtles = new Turtles();
        Assert.assertEquals("GGCAACG",turtles.lcs("GGCACCACG", "ACGGCGGATACG"));
    }

    @Test
    public void lcsTest2(){
        Turtles turtles = new Turtles();
        Assert.assertEquals("GCGCG",turtles.lcs("GCCCTAGCG", "GCGCAATG"));
    }


}