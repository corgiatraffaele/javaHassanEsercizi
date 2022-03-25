package lezione3ClasseOggetti.Es2;


public class Tester {
    public static void main(String[] args) {

        ContoCorrente mioPrimoCC= new ContoCorrente("Raf","IT42FATEMIUNBONIFICO",0.0);

        double sommaDepositata = mioPrimoCC.deposito(20);
        System.out.println("Sei un po più ricco: hai depositato " + sommaDepositata);

        double sommaPrelevata =  mioPrimoCC.prelievo(10);
        System.out.println(" Sei più povero: hai prelevato " + sommaPrelevata);

        System.out.println(mioPrimoCC.getSaldo());

    }
}

