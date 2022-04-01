package lezione3ClasseOggetti.Es4Ereditarietà.Esempi;

public class Bambino extends Persona{

    private double pesoNascita;
    private boolean prematuro;


    public Bambino(){

        super(); //richiamo il costruttore vuoto di persona

    }

    public Bambino(String nome, String cognome, double pesoNascita,boolean prematuro){

        super(nome,cognome); //richiama il costruttore pieno di persona
        this.pesoNascita=pesoNascita;
        this.prematuro=prematuro;
    }
    //i set e get di (nome e cognome) li ha impliciti perchè li eredita da persona


    public double getPesoNascita() {
        return pesoNascita;
    }

    public void setPesoNascita(double pesoNascita) {
        this.pesoNascita = pesoNascita;
    }

    public boolean isPrematuro() {
        return prematuro;
    }

    public void setPrematuro(boolean prematuro) {
        this.prematuro = prematuro;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "nome="+ getNome() +
                ", cognome=" + getCognome()+
                ", pesoNascita=" + pesoNascita +
                ", prematuro=" + prematuro +
                '}';
    }
}
