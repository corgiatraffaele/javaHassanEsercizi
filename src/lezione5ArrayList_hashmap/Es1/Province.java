package lezione5ArrayList_hashmap.Es1;

import java.util.Map;

public class Province extends Regioni{


    public Province() {
    }

    public Province(Map<String, Double> mappaRegioni) {
        super(mappaRegioni);
    }

    @Override
    public String toString() {
        return "Province{" +
                "mappaRegioni=" + mappaRegioni +
                '}';
    }
}
