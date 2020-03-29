package uvsq21601245;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final Map<String, Command> commands;

    private  CommandFactory(){
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

    public void init(Interpreteur inter){
        this.addCommand("undo", new CommandUndo(inter));
        this.addCommand("quit", new CommandQuit(inter));
    }

}
