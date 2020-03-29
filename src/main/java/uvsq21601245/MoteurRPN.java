package uvsq21601245;

import java.util.Stack;

public class MoteurRPN extends Interpreteur{


    public MoteurRPN(){
        super();
    }

    public void enregistrer(Double value){
        this.old = this.actual;
        this.actual.push(value);
    }

    public void operation(Operation operation){
        this.old = this.actual;
        Double op2=this.actual.pop();
        Double op1=this.actual.pop();
        if(operation.get_symbole()=="/" && op2==0.0){
            System.out.println("Vous ne pouvez pas diviser par 0");
            this.actual.push(op1);
            this.actual.push(op2);
        }
        else {
            this.actual.push(operation.eval(op1, op2));
        }
    }

    public void returnall(){
        System.out.println(this.actual);
    }

    public Double getPop(){
        return this.actual.pop();
    }

    public boolean emptyTest(){
        return this.actual.isEmpty();
    }

}
