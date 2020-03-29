package uvsq21601245;

public class CommandOperation implements Command {

    private MoteurRPN moteur;
    private Operation operation;

    public CommandOperation(MoteurRPN moteur, Operation operation){
        this.moteur = moteur;
        this.operation = operation;
    }

    @Override
    public void apply(){
        this.moteur.operation(this.operation);
    }
}
