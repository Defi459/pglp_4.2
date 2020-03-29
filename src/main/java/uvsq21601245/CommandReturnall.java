package uvsq21601245;

public class CommandReturnall implements Command {

    private MoteurRPN moteur;

    public CommandReturnall(MoteurRPN moteur){
        this.moteur = moteur;
    }

    @Override
    public void apply(){
        moteur.returnall();
    }
}
