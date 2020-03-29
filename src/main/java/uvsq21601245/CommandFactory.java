package uvsq21601245;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final Map<String, Command> commands;

    public  CommandFactory(){
        this.commands = new HashMap<>();
    }

    public void addCommand( String name, Command command){
        this.commands.put(name, command);
    }

    public void executeCommand(String name){
        if (this.commands.containsKey(name)){
            this.commands.get(name).apply();
        }
    }

    public void executeOperation(MoteurRPN moteur, Operation op){
        CommandOperation tmp;
        tmp = new CommandOperation(moteur,op);
        tmp.apply();
    }

    public void executeRegister(MoteurRPN moteur, Double value){
        CommandRegister tmp;
        tmp = new CommandRegister(moteur, value);
        tmp.apply();
    }

    public void init(MoteurRPN moteur){

        this.addCommand("undo", new CommandUndo(moteur));
        this.addCommand("quit", new CommandQuit(moteur));
        this.addCommand("operation", new CommandOperation(moteur,Operation.DIV));
        this.addCommand("register", new CommandRegister(moteur, 0.0));
        this.addCommand("returnall", new CommandReturnall(moteur));
    }

}
