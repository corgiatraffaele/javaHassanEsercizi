package lezione3ClasseOggetti.Es2.Exception;

public class SaldoNotDisponibileException extends Exception{


    /**
     *  creo un corstruttore
     */

    public SaldoNotDisponibileException(){

        super("Saldo non disponibile, Riprova"); //prende il costruttore del padre
    }

    public SaldoNotDisponibileException(String messageException){

        super(messageException);

    }

}
