package uvsq21601245;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SaisieRPN {

    private CommandFactory command;
    private Scanner scan;
    private static int max_value=999999999;
    private static int min_value=0;


    public SaisieRPN() {
        this.scan = new Scanner(System.in);
        this.command = new CommandFactory();
    }

    public int saisie(MoteurRPN moteur){

        String token;
        this.command.init(moteur);
        token= this.scan.nextLine();





        if (token.equals("exit")){
            command.executeCommand("returnall");
            command.executeCommand("quit");
            return 0;
        }
        if (token.equals("undo")){
            command.executeCommand("undo");
            command.executeCommand("returnall");
            return 1;
        }
        else{
            if (Pattern.matches("(\\+|\\-|\\*|\\/)",token)){

                if (moteur.emptyTest()){
                    System.out.println("Il manque deux opérandes erreur");
                    command.executeCommand("returnall");
                    return 1;
                }

                Double tmp=moteur.getPop();

                if (moteur.emptyTest()){
                    System.out.println("Il manque un opérande erreur");
                    command.executeRegister(moteur,tmp);
                    command.executeCommand("returnall");
                    return 1;
                }
                else{
                    command.executeRegister(moteur,tmp);
                    if (token.equals("+")){
                        command.executeOperation(moteur, Operation.PLUS);
                        tmp=moteur.getPop();
                        if (tmp > this.max_value || -tmp > this.max_value){
                            System.out.println("Valeur max dépassé erreur");
                            return 0;
                        }
                        else{
                            command.executeRegister(moteur,tmp);
                        }
                    }
                    if (token.equals("-")){
                        command.executeOperation(moteur, Operation.MOINS);
                        tmp=moteur.getPop();
                        if (tmp > this.max_value || -tmp > this.max_value){
                            System.out.println("Valeur max dépassé erreur");
                            return 0;
                        }
                        else{
                            command.executeRegister(moteur,tmp);
                        }
                    }
                    if (token.equals("*")){
                        command.executeOperation(moteur, Operation.MULT);
                        tmp=moteur.getPop();
                        if (tmp > this.max_value || -tmp > this.max_value){
                            System.out.println("Valeur max dépassé erreur");
                            return 0;
                        }
                        else{
                            command.executeRegister(moteur,tmp);
                        }
                    }
                    if (token.equals("/")){
                        command.executeOperation(moteur, Operation.DIV);
                        tmp=moteur.getPop();
                        if (tmp > this.max_value || -tmp > this.max_value){
                            System.out.println("Valeur max dépassé erreur");
                            return 0;
                        }
                        else{
                            command.executeRegister(moteur,tmp);
                        }
                    }
                    command.executeCommand("returnall");
                    return 1;
                }
            }
            else{
                if (Pattern.matches("\\d+?.\\d+?",token) || Pattern.matches("\\d+?",token)){
                    if (Double.parseDouble(token) > this.max_value){
                        System.out.println("Valeur max dépassé erreur");
                        return 0;
                    }
                    command.executeRegister(moteur,Double.parseDouble(token));
                    command.executeCommand("returnall");
                    return 1;
                }
                else{
                    System.out.println("N'est pas un chiffre");
                    command.executeCommand("returnall");
                    return 1;
                }

            }
        }


    }
}
