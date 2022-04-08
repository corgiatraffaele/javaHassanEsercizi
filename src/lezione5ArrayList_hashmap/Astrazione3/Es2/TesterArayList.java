package lezione5ArrayList_hashmap.Astrazione3.Es2;

import java.util.ArrayList;
import java.util.List;

public class TesterArayList {

    public static void main(String[] args) {
        List<String> nomiMacchine = new ArrayList<>();

        nomiMacchine.add("BMW");
        nomiMacchine.add("Citroen");
        nomiMacchine.add(1,"FIAT");

        //in questo caso li mette nell'indice 1

        for(String macchina : nomiMacchine)
            System.out.println(macchina);


        //----------

        System.out.println("\r LAMBDA NOTATION ARRAYLIST \r");
        nomiMacchine.forEach(macchina-> {
            System.out.println(macchina);
        });

    }
}
