package lezione4.Es4Ereditarietà.Esercizi.Es2;

public class TriangRett extends Triangolo{
        private double catetoMaggiore;
        private double catetoMin;
        private double ipotenusa;

    public TriangRett() {
    }

    public TriangRett(double catetoMaggiore, double catetoMin, double ipotenusa) {
        this.catetoMaggiore = catetoMaggiore;
        this.catetoMin = catetoMin;
        this.ipotenusa = ipotenusa;
    }

    public TriangRett(double base, double altezza, double lato1, double lato2, double lato3, double catetoMaggiore, double catetoMin, double ipotenusa) {
        super(base, altezza, lato1, lato2, lato3);
        this.catetoMaggiore = catetoMaggiore;
        this.catetoMin = catetoMin;
        this.ipotenusa = ipotenusa;
    }

    public TriangRett(Integer numlati, double base, double altezza, double lato1, double lato2, double lato3, double catetoMaggiore, double catetoMin, double ipotenusa) {
        super(numlati, base, altezza, lato1, lato2, lato3);
        this.catetoMaggiore = catetoMaggiore;
        this.catetoMin = catetoMin;
        this.ipotenusa = ipotenusa;
    }

    public double getCatetoMaggiore() {
        return catetoMaggiore;
    }

    public void setCatetoMaggiore(double catetoMaggiore) {
        this.catetoMaggiore = catetoMaggiore;
    }

    public double getCatetoMin() {
        return catetoMin;
    }

    public void setCatetoMin(double catetoMin) {
        this.catetoMin = catetoMin;
    }

    public double getIpotenusa() {
        return ipotenusa;
    }

    public void setIpotenusa(double ipotenusa) {
        this.ipotenusa = ipotenusa;
    }

    @Override
    public String toString() {
        return "TriangRett{" +
                "catetoMaggiore=" + catetoMaggiore +
                ", catetoMin=" + catetoMin +
                ", ipotenusa=" + ipotenusa +
                '}';
    }
}
