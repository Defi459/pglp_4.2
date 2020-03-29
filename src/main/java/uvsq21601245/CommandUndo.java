package uvsq21601245;

public class CommandUndo implements Command {

    private Interpreteur actual;

    public CommandUndo(Interpreteur actual){
        this.actual = actual;
    }

    @Override
    public void apply(){
        this.actual.undo();
    }
}
