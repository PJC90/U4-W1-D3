import etities.Chiamataq;
import etities.Rettangolo;
import etities.Sim;

public class Main {
    public static void main(String[] args) {

        Rettangolo a = new Rettangolo(4,2);
        Rettangolo b = new Rettangolo(10,2, 5,2);
        a.stampaRettangolo();
        b.stampaDueRettangoli();

        Sim z = new Sim(3331212);
        z.chiamate = new Chiamataq[]{111, 222};
        z.stampaSim();

    }
}