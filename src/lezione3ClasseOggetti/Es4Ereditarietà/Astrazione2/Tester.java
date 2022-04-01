package lezione3ClasseOggetti.Es4Ereditarietà.Astrazione2;

public class Tester {
    public static void main(String[] args) {

        Poligono quadrato = new Quadrato(5.0);
        System.out.println(quadrato.calcolaArea());
        System.out.println(quadrato.calcolaPerimetro());

    //--------OPPURE---------------

       Quadrato quadrato1 = new Quadrato(5.0);
        System.out.println(quadrato.calcolaArea());
        System.out.println(quadrato.calcolaPerimetro());
    }

}
