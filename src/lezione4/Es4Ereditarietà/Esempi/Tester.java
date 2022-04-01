package lezione4.Es4Ereditarietà.Esempi;



public class Tester {

    public static void main(String[] args) {
        Persona personaGenerica = new Persona("Ciccio","Pasticcio");
        System.out.println(personaGenerica);

        Bambino piccoloCucciolo = new Bambino("Ciccio", "Grazi",3.08,true);
        System.out.println(piccoloCucciolo);

        System.out.println();

        System.out.println(" La classe di appartenenza di personaGenerica : " + personaGenerica.getClass().getName());
        System.out.println(" La classe di appartenenza di personaGenerica : " + piccoloCucciolo.getClass().getName());

        /**
         * Polimorfismo
         */
        Persona nuovoPargolo = new Bambino("ciccio","pasticcio",1.0,false);
        nuovoPargolo.setCognome("pippo");
        System.out.println(nuovoPargolo);
    }



}
