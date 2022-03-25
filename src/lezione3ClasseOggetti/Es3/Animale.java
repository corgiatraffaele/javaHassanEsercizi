package lezione3ClasseOggetti.Es3;


/**Esercizio +Relazione
 * dato un animale (generico) creare la sua definizione
 *
 * faccio due campi privati e altri pubblici per capirne la differenza
 */
public class Animale {

    private String nome;
    private String tipo;
    private String colorePelo;
    public String habitat;
    public Integer vitaAnni;

    public Animale(String nome) {
        
    }

    /**
     * Creo il costruttore con i seguenti parametri
     * @param nome nome animal
     * @param tipo  mammifero, etc
     * @param colorePelo
     * @param habitat
     * @param vitaAnni
     */
    public Animale(String nome, String tipo, String colorePelo, String habitat, Integer vitaAnni) {
        this.nome = nome;
        this.tipo = tipo;
        this.colorePelo = colorePelo;
        this.habitat = habitat;
        this.vitaAnni = vitaAnni;
    }

    /**creo il get e set per le variabili private
     *
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColorePelo() {
        return colorePelo;
    }

    public void setColorePelo(String colorePelo) {
        this.colorePelo = colorePelo;
    }

    /**
     * Creo il toString per poter stamparlo con sout
     *
     */
    @Override
    public String toString() {
        return "Animale{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", colorePelo='" + colorePelo + '\'' +
                ", habitat='" + habitat + '\'' +
                ", vitaAnni=" + vitaAnni +
                '}';
    }
}
