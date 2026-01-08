package es3;

public class Articolo {
//    ATTRIBUTI
    private long EAN;
    private String description;
    private double price;
    private int piecesInStorage;
//    COSTRUTTORE
    public Articolo(long EAN, String desc, double price, int storage) {
        this.EAN = EAN;
        this.description = desc;
        this.price = price;
        this.piecesInStorage = storage;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "EAN=" + EAN +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", piecesInStorage=" + piecesInStorage +
                '}';
    }
}
