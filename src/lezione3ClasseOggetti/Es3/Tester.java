package lezione3ClasseOggetti.Es3;

public class Tester {
    public static void main(String[] args) {
        /**
         * creo un nuovo animale utilizzando la classe animale
         */
        Animale animaleUno = new Animale( "balena","mammifero","blu","oceano",10);

        System.out.println(animaleUno);
        /**
        * nome, tipo e colore sono private quindi accessibili solo utilizzando la sintassi:
         * animaleUno.get...();
         *
         * invece quelle che ho messo pubbliche le posso richiamare con:
         * animale.habitat
         *
        */

        System.out.println("l'animale " + animaleUno.getNome() + " è un " + animaleUno.getTipo() + " e vive in " + animaleUno.habitat);
        System.out.println("Il colore è "+ animaleUno.getColorePelo());

        /******Habitat******/

        String[] animaliSavana = {"zebra","leone","iena"};

        Habitat habitatUno = new Habitat("savana",40,30, animaliSavana);

        System.out.println(habitatUno);

        System.out.println("nella " +habitatUno.getNome() + " ci sono gli animali: "+ habitatUno.getAnimali());
        System.out.println("la temperatura è di " +habitatUno.getTemperatura() + " gradi");
        System.out.println("l'umidità è del " +habitatUno.getUmidità()+"%");

        //NON son riuscito a stampare gli animali ma solo la posizione di memoria, anche avendo fatto il toString


    }
}
