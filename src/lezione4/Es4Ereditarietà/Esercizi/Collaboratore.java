package lezione4.Es4Ereditarietà.Esercizi;

public class Collaboratore {
    private String ruolo;


    public Collaboratore() {

    }

    public Collaboratore(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Collaboratore{" +
                "ruolo='" + ruolo + '\'' +
                '}';
    }
}
