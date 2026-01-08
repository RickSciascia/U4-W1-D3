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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        if(number > 1000000000 )
        this.number = number;
        else {
            System.out.println("numero non valido riprova con un numero di telefono valido");
        }
    }

    public double getCredit() {
        return credit;
    }

    public String getCallList() {
        return Arrays.toString(callList);
    }
}
