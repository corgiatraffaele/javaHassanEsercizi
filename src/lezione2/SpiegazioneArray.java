package lezione2;

public class SpiegazioneArray {

    public static void main(String[] args)
    {
        //dichiaro il tipo

        int [] array = new int[10]; //dichiarazione della lunghezza
        int[] arrayinizializzato = {10,30,89,90,70,69};

        for(int i=0; i<arrayinizializzato.length; i++)
        {
            System.out.println("Elemento corrente: [" + i + "]" + arrayinizializzato[i]);

        }

    }
}
