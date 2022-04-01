package lezione3ClasseOggetti.Es4Ereditarietà.Esercizi.Es2;

public class Quadrato extends Poligono{
    private double lato1;

    public Quadrato() {
    }

    public Quadrato(Double lato1) {
        this.lato1 = lato1;
    }

    public Quadrato(Integer numlati, Double lato1) {
        super(numlati);
        this.lato1 = lato1;
    }

    public void setLato1(Double lato1) {
        this.lato1 = lato1;
    }

    public double perimetro() {
        return (lato1*getNumlati());
    }

    public double area() {
        return (lato1*lato1);
    }





    @Override
    public String toString() {
        return "Quadrato{" +
                "lato1=" + lato1 +
                '}';
    }
}
