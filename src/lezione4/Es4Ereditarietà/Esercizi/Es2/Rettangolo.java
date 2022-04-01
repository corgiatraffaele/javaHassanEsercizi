package lezione4.Es4Ereditarietà.Esercizi.Es2;

public class Rettangolo extends Poligono{
    private double base;
    private double altezza;




    public Rettangolo(double base, double altezza, double lato1, double lato2) {
        this.base = base;
        this.altezza = altezza;

    }

    public Rettangolo(Integer numlati, double base, double altezza, double lato1, double lato2) {
        super(numlati);
        this.base = base;
        this.altezza = altezza;


    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


    public double area(){
        return (getBase()*getAltezza());
            }


    public double perimetro(){
        return (getBase()+getAltezza());

    }
    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                             '}';
    }
}
