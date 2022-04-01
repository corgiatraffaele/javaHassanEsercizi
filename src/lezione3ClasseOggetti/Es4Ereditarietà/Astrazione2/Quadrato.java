package lezione3ClasseOggetti.Es4Ereditarietà.Astrazione2;


public class Quadrato extends Poligono {

        private Double valoreLato;
        private static final Integer NUMERO_LATI = 4;//conosco il numero di lati

        public Quadrato(){super(NUMERO_LATI);}

        public Quadrato(Double valoreLato){
            super(NUMERO_LATI);
            this.valoreLato= valoreLato;
        }



        @Override
        public double calcolaPerimetro() {
            return 0;
        }

        @Override
        public double calcolaArea() {
            return 0;
        }
    }

