import es1.Rettangolo;
import es2.Calls;
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
        sim1.printSIMData();
//        sim1.setNumber(323456789);
//        sim1.printSIMData();
        Calls chiamata1 = new Calls(2.0,3331234567L);
        Calls chiamata2 = new Calls(2.0,3331234568L);
        Calls chiamata3 = new Calls(2.0,3331234569L);
        Calls chiamata4 = new Calls(2.0,3331234560L);
        Calls chiamata5 = new Calls(2.0,3331234561L);
        Calls[] arrayOfCalls = {chiamata1,chiamata2,chiamata3,chiamata4,chiamata5};
        sim1.setCallList(arrayOfCalls);
        sim1.printSIMData();

//        Sim.printSIMData(sim2);
//        Articolo art1 = new Articolo(8052747860005L,"Acqua CLAUDIA",0.45,60);
//        System.out.println(art1.toString());

    }
}
