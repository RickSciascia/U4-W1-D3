package es2;

public class Calls {
    // ATTRIBUTI
    private double minutes;
    private long numberCalled;
    // COSTRUTTORE
    public Calls(double minutes, long number) {
        this.minutes = minutes;
        this.numberCalled = number;
    }
// METODI

    public long getNumberCalled() {
        return numberCalled;
    }

    public double getMinutes() {
        return minutes;
    }
}
