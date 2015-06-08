import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class MathTest {

    private Math math;

    @Before
    public void setUp() {
        math = new Math();
    }

    @Test
    public void add() {
        int actual = math.add(1, 2);

        Assert.assertEquals(3, actual);
    }

    @Test
    public void subtract() {
        int actual = math.subtract(1, 2);

        Assert.assertEquals(-1, actual);
    }
}
