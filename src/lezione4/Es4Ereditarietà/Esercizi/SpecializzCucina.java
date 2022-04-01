package lezione4.Es4Ereditarietà.Esercizi;

import java.util.Arrays;

public class SpecializzCucina extends Scuola{
    private String[] materie;
    private Integer numeroAllievi;


    public SpecializzCucina(String[] materie, Integer numeroAllievi) {
        this.materie = materie;
        this.numeroAllievi = numeroAllievi;
    }

    public SpecializzCucina(String nome, String indirizzo, String[] materie, Integer numeroAllievi) {
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
        return "SpecializzCucina{" +
                "materie=" + Arrays.toString(materie) +
                ", numeroAllievi=" + numeroAllievi +
                '}';
    }
}
