package uvsq21601245;


import java.util.Stack;

public class Interpreteur
{
    public Stack<Double> actual;
    public Stack<Double> old;

    public Interpreteur(){
        this.actual = new Stack<Double>();
        this.old = new Stack<Double>();
    }

    public void undo(){
        actual = (Stack<Double>)old.clone();
    }

    public void quit(){
        System.out.print("Fin du programme");
        System.exit(0);
    }
}
