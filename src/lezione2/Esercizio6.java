package lezione2;

public class Esercizio6 {


    public static void main(String[] args){

        String[] array = {"alfa","beta","gamma","delta","epsilon","alfa"};

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] == array[j]){
                    System.out.println(array[i] + "è uguale a " +array[j] );

            }

        }

        }


    }

}
