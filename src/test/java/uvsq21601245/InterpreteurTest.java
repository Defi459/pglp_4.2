package uvsq21601245;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class InterpreteurTest
{

    @Test
    public void TestUndo(){
        Interpreteur inter = new Interpreteur();
        inter.actual.push(2.0);
        inter.old.push(inter.actual.pop());
        inter.actual.push(2.0);
        inter.actual.push(3.0);
        inter.undo();
        assertEquals(2.0,inter.actual.pop(),0.000001);
    }
    
}
