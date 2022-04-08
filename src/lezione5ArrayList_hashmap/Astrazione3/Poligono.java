package lezione5ArrayList_hashmap.Astrazione3;

import java.util.HashMap;
import java.util.Map;

public abstract class Poligono implements MisurePoligono{

    Map<String, Double>mappaLati = new HashMap<>();

    public Poligono() {
    }

    /**
     * costruttore che 'istanzia' una classe poligono mediante una mappa passata come parametro.
     * Questa mappa come chiave/key(k) ha il nome del lato che vogliamo mappare.
     * come valore ha il valore effettivo del lato
     * es:<"base",22.2>
     * @param mappaLati hashmap dei lati
     *
     */

    public Poligono(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }

    public Map<String, Double> getMappaLati() {
        return mappaLati;
    }

    public void setMappaLati(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }
    
    @Override
    public abstract double calcolaArea();

    @Override
    public abstract double calcolaPerimetro();

    @Override
    public String toString() {
        return "Poligono{" +
                "mappaLati=" + mappaLati +
                '}';
    }

  
}
