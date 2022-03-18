package lezione2;

import java.util.Arrays;

public class Esercizio4 {

    public static void main(String[] args)
    {
            //STEP1 DICHIARO IL MIO ARRAY DA ORDINARE

        int[] array= {120,32,3,10,90,70};

        for (int i = 0; i < array.length; i++)
        { //tengo bloccato l'elemento che voglio confrontare con i successivi
            for (int j = 0; j < array.length; j++)
            {
                //prendo gli elementi successivi
                if(array[i] < array[j])
                {
                    int tmp= array[i];
                    array[i]= array[j];
                    array[j]=tmp;


                }
            }

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array));
        }


    }




}
