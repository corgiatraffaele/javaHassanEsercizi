package lezione3ClasseOggetti.Es4Ereditarietà.Esercizi.Es2;



public class Tester {
    public static void main(String[] args) {

       Rettangolo uno = new Rettangolo(4,5,6,2 );
        System.out.println(uno);
        System.out.println(uno.perimetro());

        Poligono due = new Triangolo(2,3,4,5,2);
        System.out.println(due);

        System.out.println(((Triangolo) due).area());

        System.out.println(((Triangolo) due).perimetro());


        Poligono tre = new Quadrato(5.0);
        System.out.println(tre);
        System.out.println(((Quadrato) tre).perimetro());
        System.out.println(((Quadrato) tre).area());

        //devo farei il cast perche in POLIGONO non ho messo area() e perimetro():

        Quadrato quadrato = new Quadrato(2, 5.0);


    }
}
