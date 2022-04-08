package lezione5ArrayList_hashmap.Astrazione3.PoligoniSpecializzati;

import lezione5ArrayList_hashmap.Astrazione3.Poligono;

import java.util.Map;

public class TriangoloRettangolo extends Poligono {
    public TriangoloRettangolo() {
        super();
    }

    public TriangoloRettangolo(Map<String, Double> mappaLati) {
        super(mappaLati);
    }

    @Override
    public double calcolaArea() {
        return (getMappaLati().get("catetoUno")* getMappaLati().get("catetoDue"))/2;
    }

    @Override
    public double calcolaPerimetro() {
        return (getMappaLati().get("catetoUno")+ getMappaLati().get("catetoDue")+ getMappaLati().get("ipotenusa"));
    }
}
