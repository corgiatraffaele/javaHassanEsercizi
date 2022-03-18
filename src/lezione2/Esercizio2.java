package lezione2;

import java.util.Scanner;

/**
 * @author Raffaele Corgiat
 * Esercizio due che chiede di implementare i cicli
 * (for, while, do-while) sommando due numeri per x volte
 * tenendo traccia della somma di questi due numeri
 *
 */

public class Esercizio2 {

    public static void main(String[] args)
    {

        int primoNumero;// dichiaro la variabile primoNumero;
        int secondoNumero;// dichiaro la variabile secondoNumero;
        Scanner inputUtente = new Scanner(System.in);
        int somma = 0;//-Dichiaro variabile somma inizializzata a 0(somma->0);
        int numeroIterazioni = 0; //dichiaro numeroIterazioni inizializzato a 0

            //while

        while(numeroIterazioni<4) //4 è hard-coded (ovvero inseriamo noi il valore)
        {
            System.out.println("Inserisci il primo numero");//chiedo all'utente di inserire primoNumero;
            primoNumero = inputUtente.nextInt();


            System.out.println("Inserisci il secondo numero");//-chiedo all'utente di inserire secondoNumero;
            secondoNumero = inputUtente.nextInt();

            // System.out.println(primoNumero + " "+secondoNumero );


            //somma = primoNumero + secondoNumero;//sommo primoNumero e secondoNUmero;

            //System.out.println("La somma tra il " + primoNumero + " + " + secondoNumero + " = " + somma);

            somma = somma + primoNumero +secondoNumero;

            numeroIterazioni = numeroIterazioni + 1;

            System.out.println("La somma è " +  somma);
        }


            //for

        for(int i=0; i<4; i++){

            System.out.println("Inserisci il primo numero");//chiedo all'utente di inserire primoNumero;
            primoNumero = inputUtente.nextInt();

            System.out.println("Inserisci il secondo numero");//-chiedo all'utente di inserire secondoNumero;
            secondoNumero = inputUtente.nextInt();

            somma = somma + primoNumero +secondoNumero;

            System.out.println(" la somma è " +somma);
            i++;

        }


            //do while

        do{ System.out.println("Inserisci il primo numero");//chiedo all'utente di inserire primoNumero;
            primoNumero = inputUtente.nextInt();

            System.out.println("Inserisci il secondo numero");//-chiedo all'utente di inserire secondoNumero;
            secondoNumero = inputUtente.nextInt();

            somma = somma + primoNumero +secondoNumero;

            System.out.println(" la somma è " +somma);

        }while (numeroIterazioni<4);

    }



}
