package lezione2;

import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {

        int [] array = new int[5]; //dichiarazione della lunghezza
        Scanner inputUtente = new Scanner(System.in);





        //aggiungo elementi all'array
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Inserisci un numero");//chiedo all'utente di inserire numero;

            array[i]= inputUtente.nextInt();

        }

    }
}
