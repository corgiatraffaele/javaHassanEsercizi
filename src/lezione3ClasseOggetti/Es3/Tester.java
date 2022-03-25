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

    }
}
