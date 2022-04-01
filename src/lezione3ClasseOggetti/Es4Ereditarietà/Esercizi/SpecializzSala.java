package lezione3ClasseOggetti.Es4Ereditarietà.Esercizi;

import java.util.Arrays;

public class SpecializzSala extends Scuola{
    private String[] materie;
    private Integer numeroAllievi;

    public SpecializzSala(String[] materie, Integer numeroAllievi) {
        this.materie = materie;
        this.numeroAllievi = numeroAllievi;
    }

    public SpecializzSala(String nome, String indirizzo, String[] materie, Integer numeroAllievi) {
        super(nome, indirizzo);
        this.materie = materie;
        this.numeroAllievi = numeroAllievi;
    }

    public String[] getMaterie() {
        return materie;
    }

    public void setMaterie(String[] materie) {
        this.materie = materie;
    }

    public Integer getNumeroAllievi() {
        return numeroAllievi;
    }

    public void setNumeroAllievi(Integer numeroAllievi) {
        this.numeroAllievi = numeroAllievi;
    }

    @Override
    public String toString() {
        return "SpecializzSala{" +
                "materie=" + Arrays.toString(materie) +
                ", numeroAllievi=" + numeroAllievi +
                '}';
    }
}
