package lezione3ClasseOggetti.Es2;

import lezione3ClasseOggetti.Es2.Exception.SaldoNotDisponibileException;

/**
 * Questa classe andrà a rapprensentare gli stati e i compostamenti di un conto corrente studiato e analizzato
 */
public class ContoCorrente {

    private String titolare;
    private String iban;
    private double saldo;

    public ContoCorrente(){}


    /**
     * Costruttore pieno che rappresenta la crazionw del mio oggetto conto corrente
     * @param titolare titolare del conto
     * @param iban  numero iban unicovo il numero del mio cc
     * @param saldo saldo attuale del mio conto corrente
     */
    public ContoCorrente(String titolare, String iban, double saldo) {
        this.titolare = titolare;
        this.iban = iban;
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */


    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Funzione che va a prelevare una somma specificata in input
     * @param sommaPrelevare
     * @return somma prelevata da far visualizzare in output all'utente
     * @La sommaPrelevare deve essere minore = del saldoDisponibile
     */

    public double prelievo(double sommaPrelevare) {

        try {//flusso che dovrebbe essere eseguito
            //controllo che il saldo sia >= alla somma da prelevare
            if (this.saldo < sommaPrelevare)
                throw new SaldoNotDisponibileException();

            this.saldo = this.saldo - sommaPrelevare;
            return sommaPrelevare;

        } catch (SaldoNotDisponibileException ex) {
            System.out.println(ex.getMessage());
        }
        return 0.0;
    }

        /*/controllo che il saldo sia >= alla somma da prelevare
        if (this.saldo >= sommaPrelevare) {
            //se vero posso prelevare
            this.saldo = this.saldo - sommaPrelevare;
            return sommaPrelevare;

        } else {

            System.out.println("SEI POVERO NON PUOI PRELEVAR PIÙ DI QUANTO HAI.SVEGLIATI!");
            return Double.NEGATIVE_INFINITY;
            //per farlo uscire altrimenti non funziona perchè il metodo vuole double.e mi ritorna -infinito+
        }*/



        /**
         * funzione che si occupa di prelevare una somma di denaro specificata in input
         * @param sommaDeposito
         * @return sommaPrelevata
         *
         */

        public double deposito(double sommaDeposito){

            this.saldo = this.saldo + sommaDeposito;
            return sommaDeposito;

        }





    @Override
    public String toString() {
        return "ContoCorrente{" +
                "titolare='" + titolare + '\'' +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
