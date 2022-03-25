package lezione3ClasseOggetti.Es1;

public class Tester {

    public static void main(String[] args) {

        //Istanzio il mio oggetto di tipo persona tramite una variabile di istanza
        Persona ciccioPasticcio = new Persona();
        ciccioPasticcio.nome ="Ciccio"; //posso accedervi così perchè è public
        ciccioPasticcio.cognome = "Pasticcio";
        System.out.println(ciccioPasticcio);


        System.out.println();
        Persona ciccioGraziani = new Persona("Ciccio","Graziani");

        System.out.println(ciccioGraziani);

        //PersonaPrivate ciccioPasticcio = new PersonaPrivate();
        //ciccioPasticcio.nome = "Ciccio";// non si può perchè in PersonaPrivate nome è Private*/


     PersonaPrivate ciccioPasticcio2 = new PersonaPrivate("Ciccio","Pasticcio");
        System.out.println(ciccioPasticcio);

        PersonaPrivate ciccioPasticcio3 = new PersonaPrivate("Ciccio","Pasticcio");
        System.out.println(ciccioPasticcio);

        System.out.println("N.ro persone create " + PersonaPrivate.numeroPersone);

    }



}
