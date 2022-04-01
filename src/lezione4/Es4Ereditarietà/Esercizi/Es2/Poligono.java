package lezione4.Es4Ereditarietà.Esercizi.Es2;

public class Poligono {

    private int numlati;

    /**
     * costruttore vuoto
     */

    public Poligono(){}



/**
 * costruttore
 * @param numlati
  */
    public Poligono(Integer numlati) {
        this.numlati = numlati;
    }

    /**
     * set&get
     */

    public Integer getNumlati() {
        return numlati;
    }

    public void setNumlati(Integer numlati) {
        this.numlati = numlati;
    }
}
