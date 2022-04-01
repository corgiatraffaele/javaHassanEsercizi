package lezione4.Es4Ereditarietà.Astrazione2;

/**
 * @author Raffaele
 * Classe astratta che andrà a nascondere i dettagli delle classi specializzate
 */
public abstract class Poligono implements MIsurePoligono {

    private Integer numeroLati;

    public Poligono(Integer numeroLati) {
        this.numeroLati = this.numeroLati;
    }

    public Integer getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(Integer numeroLati) {
        this.numeroLati = numeroLati;
    }

    /**
     * Astratte
     *
     * @return perimetro tramite la somma dei valori dei lati
     */

    public abstract double calcolaPerimetro();

    public abstract double calcolaArea();


    @Override
    public String toString() {
        return "Poligono{" +
                "numeroLati=" + numeroLati +
                '}';
    }


}
