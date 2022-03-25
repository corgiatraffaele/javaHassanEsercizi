package lezione3ClasseOggetti.Es1;

/**
 * @author Raffaele Corgiat
 * Esempio che andrà a descrivere come creare una classe
 * andanfo in seguito ad instanziare l'oggetto dello stesso
 *
 */
public class Persona {


    /*quelli di seguito sono gli stati (attributi/variabili) di un potenziale oggetto di tipo persona
    * variabili d'istanza*/
    public String nome;
    public String cognome;
    public String dataNascita;
    public Integer età;


    /*dichiarazione dei costruttori (mediante overload)*/
    //il mio costruttore dovrà avere lo stesso nome della mia classe(maiuscole e minuscole incluse)
    //buona prassi dichiarare il costruttore vuoto

    public Persona(){

    }

    public Persona(String nome, String cognome) {
        //this.nome si definisce alla variabile d'istanza dichiarate all'inizio della classe
        this.nome = nome;
        this.cognome = cognome;

    }

    public Persona(String nome, String cognome,String dataNascita,Integer età){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita= dataNascita;
        this.età = età;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", età=" + età +
                '}';
    }
}
