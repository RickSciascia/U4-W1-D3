package es3;

public class Carrello {
//    ATTRIBUTI
    private Cliente clienteAssociato;
    private Articolo[] listaArticoli;
//    COSTRUTTORE
    public Carrello (Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.listaArticoli = new Articolo[0];
    }
//    METODI
    public double getTotal() {
        double totale = 0;
        for (int i=0; i< listaArticoli.length;i++) {
            totale += listaArticoli[i].getPrice();
        }
        return totale;
    }

}
