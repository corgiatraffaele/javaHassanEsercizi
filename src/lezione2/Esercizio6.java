package lezione2;


//Scrivere un programma che controlli se vi sono due righe all’interno di un array uguali

public class Esercizio6 {

    public static void main(String[] args) {
        int[] array= {120,32,3,10,90,70,120};

        for (int i = 0; i <array.length ; i++) {
            { //tengo bloccato l'elemento che voglio confrontare con i successivi
                for (int j = 0; j < array.length; j++)
                {
                    //prendo gli elementi successivi
                    if(array[i] == array[j])
                    {
                        System.out.println("l'array contiene due valori di valore = " + array[i]);

                    }
                }
            }}


}}

