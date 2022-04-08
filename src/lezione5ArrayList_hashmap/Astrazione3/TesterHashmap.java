package lezione5ArrayList_hashmap.Astrazione3;

import lezione5ArrayList_hashmap.Astrazione3.PoligoniSpecializzati.Rettangolo;
import lezione5ArrayList_hashmap.Astrazione3.PoligoniSpecializzati.TriangoloRettangolo;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class TesterHashmap {
    public static void main(String[] args) {

        Map<String,Double> mappaRettangolo = new HashMap<>();
        mappaRettangolo.put("base",10.0);
        mappaRettangolo.put("altezza",20.0);

        Rettangolo rettangolo = new Rettangolo(mappaRettangolo);

        System.out.println("Area " +rettangolo.getClass().getName() + " = "+ rettangolo.calcolaArea());
        System.out.println("Perimetro " +rettangolo.getClass().getName() + " = "+ rettangolo.calcolaPerimetro());



        Map<String,Double> mappaTriangoloRettangolo = new HashMap<>();
        mappaTriangoloRettangolo.put("catetoUno",10.0);
        mappaTriangoloRettangolo.put("catetoDue",20.0);
        mappaTriangoloRettangolo.put("ipotenusa",30.0);

        TriangoloRettangolo triangoloRettangolo= new TriangoloRettangolo(mappaTriangoloRettangolo);
        System.out.println("Area " +triangoloRettangolo.calcolaArea());
        System.out.println("Perimetro " +triangoloRettangolo.calcolaPerimetro());


        for(String key : mappaRettangolo.keySet() ){

            System.out.println((key + " " + mappaRettangolo.get(key)));
            System.out.println("chiave: " +  key + "-->" + "valore: " + mappaRettangolo.get(key)) ;

        }

            //secondo modo per fare la stessa cosa

        System.out.println("\n LAMDA NOTATION\n");
        mappaRettangolo.forEach((key,value)->{
            System.out.println(("Chiave: " + key + "-->" + "valore: " + value ) );
        });


        System.out.println("\n ITERO SU KEYSET() LAMBDA NOTATION \n");

        mappaRettangolo.keySet().forEach(key ->{
            System.out.println(("chiave: " + key + "--->" + "valore: " + mappaRettangolo.get(key)));
        });

        //valori
        System.out.println("\t ITERO SUI VALORI \t");
        for(Double v : mappaTriangoloRettangolo.values()) {
            System.out.println("VALORI: " + v);
        }

        System.out.println("\n ITERO SU VALUES() LAMBDA NOTATION \n");
        mappaTriangoloRettangolo.values().forEach(v ->{
            System.out.println("VALORE LAMBDA NOTATION: " + v);
        });


    }







}
