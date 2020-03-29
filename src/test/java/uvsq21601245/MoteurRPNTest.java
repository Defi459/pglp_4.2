package uvsq21601245;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MoteurRPNTest {


    @Test
    public void testResultatMult(){
        MoteurRPN moteur= new MoteurRPN();
        moteur.enregistrer(4.0);
        moteur.enregistrer(2.0);
        moteur.operation(Operation.MULT);
        assertEquals(moteur.getPop(),8.0,0.00001);
    }

    @Test
    public void testResultatPlus(){
        MoteurRPN moteur= new MoteurRPN();
        moteur.enregistrer(4.0);
        moteur.enregistrer(2.0);
        moteur.operation(Operation.PLUS);
        assertEquals(moteur.getPop(),6.0,0.00001);
    }

    @Test
    public void testResultatMoins(){
        MoteurRPN moteur= new MoteurRPN();
        moteur.enregistrer(4.0);
        moteur.enregistrer(2.0);
        moteur.operation(Operation.MOINS);
        assertEquals(moteur.getPop(),2.0,0.00001);
    }

    @Test
    public void testResultatDiv(){
        MoteurRPN moteur= new MoteurRPN();
        moteur.enregistrer(4.0);
        moteur.enregistrer(2.0);
        moteur.operation(Operation.DIV);
        assertEquals(moteur.getPop(),2.0,0.00001);
    }

    @Test
    public void testResultatDiv0(){
        MoteurRPN moteur= new MoteurRPN();
        moteur.enregistrer(4.0);
        moteur.enregistrer(0.0);
        moteur.operation(Operation.DIV);
        moteur.operation(Operation.PLUS);
        assertEquals(moteur.getPop(),4.0,0.00001);

    }

}
