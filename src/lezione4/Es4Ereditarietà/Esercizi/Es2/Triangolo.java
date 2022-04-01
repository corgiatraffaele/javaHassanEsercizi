package lezione4.Es4Ereditarietà.Esercizi.Es2;

public class Triangolo extends Poligono {
        private double base;
        private double altezza;
        private double lato1;
        private double lato2;
        private double lato3;


    public Triangolo() {
    }


    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public Triangolo(Integer numlati, double base, double altezza, double lato1, double lato2, double lato3) {
        super(numlati);
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
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

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }

    public double area(){
       return (getBase() * getAltezza())/2;
    }

    public double perimetro(){

        return (lato1 + lato2 + lato3);
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", lato1=" + lato1 +
                ", lato2=" + lato2 +
                ", lato3=" + lato3 +
                '}';
    }
}

