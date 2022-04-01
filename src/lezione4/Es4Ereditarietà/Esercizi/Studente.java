package lezione4.Es4Ereditarietà.Esercizi;

public class Studente extends Persona {
    private String classe;
    private Integer mediaVoto;



    public Studente(){};

    public Studente(String nome, String cognome, Integer età, String classe, Integer mediaVoto) {
        super(nome, cognome, età);
        this.classe = classe;
        this.mediaVoto = mediaVoto;
    }




    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getMediaVoto() {
        return mediaVoto;
    }

    public void setMediaVoto(Integer mediaVoto) {
        this.mediaVoto = mediaVoto;
    }


    @Override
    public String toString() {
        return "Studente{" +
                "classe='" + classe + '\'' +
                ", mediaVoto=" + mediaVoto +
                '}';
    }
}
