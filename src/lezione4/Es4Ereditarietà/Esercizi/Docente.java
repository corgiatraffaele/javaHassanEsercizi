package lezione4.Es4Ereditarietà.Esercizi;

import java.util.Arrays;

public class Docente extends Persona{

    private String materia;
    private String[] classi;


    public Docente() {

    }

    public Docente(String nome, String cognome, Integer età, String materia, String[] classi) {
        super(nome, cognome, età);
        this.materia = materia;
        this.classi = classi;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String[] getClassi() {
        return classi;
    }

    public void setClassi(String[] classi) {
        this.classi = classi;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "materia='" + materia + '\'' +
                ", classi=" + Arrays.toString(classi) +
                '}';
    }
}
