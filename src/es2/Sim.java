package es2;

import java.util.Arrays;

public class Sim {
//    ATTRIBUTI
    private long number;
    private double credit;
    private Calls[] callList;
//    COSTRUTTORE
    public Sim(long number) {
        this.number = number;
        this.credit = 0.0;
        this.callList = new Calls[5];
    }
//    METODI
    public static void printSIMData(Sim anySim) {
        System.out.println("Dettagli SIM: Numero :" + anySim.number);
        System.out.println("Credito :" + anySim.credit + " euro");
        System.out.println("Chiamate effettuate :" + Arrays.toString(anySim.callList));
    }
}
