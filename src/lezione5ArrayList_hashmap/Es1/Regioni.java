package lezione5ArrayList_hashmap.Es1;


import java.util.HashMap;
import java.util.Map;

public abstract class Regioni {

    Map<String, Double> mappaRegioni = new HashMap<>();



    public Regioni() {
    }

    public Regioni(Map<String, Double> mappaRegioni) {
        this.mappaRegioni = mappaRegioni;
    }

    public Map<String, Double> getMappaRegioni() {
        return mappaRegioni;
    }

    public void setMappaRegioni(Map<String, Double> mappaRegioni) {
        this.mappaRegioni = mappaRegioni;
    }

    @Override
    public String toString() {
        return "Regioni{" +
                "mappaRegioni=" + mappaRegioni +
                '}';
    }
}
