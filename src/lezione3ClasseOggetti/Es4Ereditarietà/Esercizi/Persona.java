package lezione3ClasseOggetti.Es4Ereditarietà.Esercizi;

public class Persona {
        private String nome;
        private String cognome;
        private Integer età;

    public Persona() {

    }

    public Persona(String nome, String cognome, Integer età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
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

    public Integer getEtà() {
        return età;
    }

    public void setEtà(Integer età) {
        this.età = età;
    }


}
