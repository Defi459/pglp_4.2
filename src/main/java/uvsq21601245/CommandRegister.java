package uvsq21601245;

public class CommandRegister implements Command{

    private MoteurRPN moteur;
    private Double value;

    public CommandRegister(MoteurRPN moteur, Double value){

        this.moteur = moteur;
        this.value = value;
    }

    @Override
    public void apply(){
        this.moteur.enregistrer(this.value);
    }
}
