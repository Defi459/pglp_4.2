package uvsq21601245;

public enum Operation {

    PLUS("+"){
        public Double eval(Double o1, Double o2) {
            return o1+o2;
        }
    },
    MOINS("-"){
        public Double eval(Double o1, Double o2){
            return o1-o2;
        }
    },
    MULT("*") {
        public Double eval(Double o1, Double o2){
            return o1*o2;
        }
    },
    DIV("/"){
        public Double eval(Double o1, Double o2) {
            return o1 / o2;
        }
    };

    private String symbole;

    Operation(String symbole){
        this.symbole = symbole;
    }

    public String get_symbole(){
        return this.symbole;
    }

    public abstract Double eval(Double o1, Double o2);

}
