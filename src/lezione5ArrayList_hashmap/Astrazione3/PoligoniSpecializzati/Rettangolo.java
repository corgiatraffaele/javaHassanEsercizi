package lezione5ArrayList_hashmap.Astrazione3.PoligoniSpecializzati;

import lezione5ArrayList_hashmap.Astrazione3.Poligono;

import java.util.Map;

public  class Rettangolo extends Poligono {

    public Rettangolo() {
    }

    public Rettangolo(Map<String, Double> mappaLati) {
        super(mappaLati);
    }

    @Override
    public double calcolaArea() {
        return getMappaLati().get("base")* getMappaLati().get("altezza");
    }

    @Override
    public double calcolaPerimetro() {
        return (getMappaLati().get("base")+ getMappaLati().get("altezza")) *2;
     }
}
