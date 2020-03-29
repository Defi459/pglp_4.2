package uvsq21601245;

public enum CalculatriceRPN {


    CALCULATRICE(){
        public void init(){
            System.out.println("Entrez vos expressions:");
            while(true){
                if (saisie.saisie(moteur)==0){
                    break;
                }
            }
        }
    };

    public MoteurRPN moteur;
    public SaisieRPN saisie;

    CalculatriceRPN() {
        this.moteur = new MoteurRPN();
        this.saisie = new SaisieRPN();
    }

    abstract public void init();

    public static void main(String[] args) {
        CalculatriceRPN.CALCULATRICE.init();
    }


}
