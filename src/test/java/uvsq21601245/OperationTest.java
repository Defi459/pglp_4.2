package uvsq21601245;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void testPlus(){
        Operation plus= Operation.PLUS;
        assertEquals(plus.eval(1.0,3.0), 4.0, 0.001);
    }

    @Test
    public void testMoins(){
        Operation moins= Operation.MOINS;
        assertEquals(moins.eval(1.0,3.0), -2.0, 0.001);
    }

    @Test
    public void testDiv(){
        Operation div= Operation.DIV;
        assertEquals(div.eval(3.0,3.0), 1.0, 0.001);
    }

    @Test
    public void testMult(){
        Operation mult= Operation.MULT;
        assertEquals(mult.eval(1.0,3.0), 3.0, 0.001);
    }
}
