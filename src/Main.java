import es1.Rettangolo;
import es2.Sim;
import es3.Articolo;

public class Main {
    public static void main(String[] args) {
//        Rettangolo r1 = new Rettangolo(10,15);
//        Rettangolo.printRettangolo(r1);
//        Rettangolo r2 = new Rettangolo(15,10);
//        Rettangolo.printDueRettangoli(r1,r2);
        Sim sim1 = new Sim(3334567890L);
//        Sim sim2 = new Sim(3934567891L);
        Sim.printSIMData(sim1);
        sim1.setNumber(323456789);
        Sim.printSIMData(sim1);
//        Sim.printSIMData(sim2);
//        Articolo art1 = new Articolo(8052747860005L,"Acqua CLAUDIA",0.45,60);
//        System.out.println(art1.toString());

    }
}
