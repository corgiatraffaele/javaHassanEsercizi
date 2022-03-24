package lezione2;

public class Esercizio7 {


    public static void main(String[] args){

        String[] array = {"alfa","beta","gamma","delta","epsilon"};

        String[] array2 = {"a","b","c","d","epsilon","f"};


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] == array2[j]){
                    System.out.println(array[i] + "è uguale a " +array2[j] );

                }

            }

        }


    }

}
