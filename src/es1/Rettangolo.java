package es1;

public class Rettangolo {
//    ATTRIBUTI
    private double base;
    private double height;
//    COSTRUTTORE
    public Rettangolo(double base, double height) {
        this.base = base;
        this.height = height;
    }
//    METODI
    private double getArea() {
        return base * height;
    }
    private double getPerimeter() {
        return 2 * (base + height);
    }
    public static void printRettangolo(Rettangolo r1) {
        System.out.println("L'area del tuo rettangolo è: " + r1.getArea() + " il perimetro è : " + r1.getPerimeter());
    }
    public static void printDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("L'area del 1o rettangolo è: " + r1.getArea() + " il perimetro è : " + r1.getPerimeter());
        System.out.println("L'area del 2o rettangolo è: " + r2.getArea() + " il perimetro è : " + r2.getPerimeter());
        System.out.println("L'area dei 2 rettangoli sommati è: " + (r1.getArea() + r2.getArea()) + " il perimetro dei 2 rettangoli sommati è : "+ (r1.getPerimeter() + r2.getPerimeter()));
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
