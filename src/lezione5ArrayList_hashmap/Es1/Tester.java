package lezione5ArrayList_hashmap.Es1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {



        ArrayList<String> cittaTorino = new ArrayList<>();

        cittaTorino.add("Chieri");
        cittaTorino.add("Venaria");
        cittaTorino.add("Trofarello");

        /*cittaTorino.forEach(città -> {
            System.out.println(città);
        });*/

        ArrayList<String> cittaAlessandria = new ArrayList<>();

        cittaAlessandria.add("Acqui Terme");
        cittaAlessandria.add("Casale Monferrato");


       /* cittaTorino.forEach(città -> {
            System.out.println(città);
        });*/

        ArrayList<String> cittaMilano = new ArrayList<>();

        cittaTorino.add("Rho");
        cittaTorino.add("Bollate");

        ArrayList<String> cittaBergamo = new ArrayList<>();

        cittaTorino.add("Castro");
        cittaTorino.add("Treviglio");



        Map<String,ArrayList<String>> mappaRegione = new HashMap<>();
        mappaRegione.put("Torino",cittaTorino);
        mappaRegione.put("Alessandria",cittaAlessandria);

        Map<String,ArrayList<String>> mappaLombardia = new HashMap<>();
        mappaLombardia.put("Milano",cittaMilano);
        mappaLombardia.put("Bergamo",cittaBergamo);

        Map<String,Map<String,ArrayList<String>>> mappaItalia = new HashMap<>();
        mappaItalia.put("Piemonte",mappaRegione);
        //System.out.println(mappaItalia);

        mappaItalia.put("Lombardia",mappaLombardia);
        System.out.println(mappaItalia);



    }
}
