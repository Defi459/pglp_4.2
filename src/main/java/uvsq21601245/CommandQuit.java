package uvsq21601245;

public class CommandQuit implements Command {

    public Interpreteur actual;

    public CommandQuit(Interpreteur interpreteur){
        this.actual = interpreteur;
    }

    @Override
    public void apply(){
        this.actual.quit();
    }
}
