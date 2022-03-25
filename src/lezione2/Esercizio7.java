package lezione2;

public class Esercizio7 {


    public static void main(String[] args){

        String[] array = {"alfa","beta","gamma","delta","epsilon"};

        String[] array2 = {"a","b","c","d","epsilon","f"};


        for (String s : array) {

            for (int j = 0; j < array.length; j++) {

                if (s.equals(array2[j])) {
                    System.out.println(s + "è uguale a " + array2[j]);

                }

            }

        }


    }

}
