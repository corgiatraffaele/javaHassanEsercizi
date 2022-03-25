package lezione3ClasseOggetti.Es1;

/**
 * @author Raffaele Corgiat
 * Esempio che andrà a descrivere come creare una classe
 * andanfo in seguito ad instanziare l'oggetto dello stesso
 *
 */
public class PersonaPrivate {


    /*quelli di seguito sono gli stati (attributi/variabili) di un potenziale oggetto di tipo persona
    * variabili d'istanza*/
    private String nome;
    private String cognome;
    private String dataNascita;
    private Integer età;
    public static Integer numeroPersone =0;


    /*dichiarazione dei costruttori (mediante overload)*/
    //il mio costruttore dovrà avere lo stesso nome della mia classe(maiuscole e minuscole incluse)
    //buona prassi dichiarare il costruttore vuoto

    public PersonaPrivate(){
    numeroPersone ++;
    }

    public PersonaPrivate(String nome, String cognome) {
        //this.nome si definisce alla variabile d'istanza dichiarate all'inizio della classe
        this.nome = nome;
        this.cognome = cognome;
        numeroPersone ++;
    }

    public PersonaPrivate(String nome, String cognome, String dataNascita, Integer età){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita= dataNascita;
        this.età = età;
        numeroPersone ++;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Integer getEtà() {
        return età;
    }

    public void setEtà(Integer età) {
        this.età = età;
    }
}
