package lezione2;

import java.util.Scanner;
public class Esercizio3 {

    public static void main(String[] args) {

        int [] array = new int[5]; //dichiarazione della lunghezza
        // int[] array= {5,10,15,2,8};
        int somma =0;
        Scanner inputUtente = new Scanner(System.in);


        for(int i=0; i<array.length; i++)
        {
            System.out.println("Inserisci un numero");//chiedo all'utente di inserire numero;

          array[i]= inputUtente.nextInt();

        }


        for(int i=0; i<array.length; i++){

            somma += array[i];


        }
        System.out.println(" la somma è " +somma);


        System.out.println("la media è " + somma/(double)array.length);

    }





}
