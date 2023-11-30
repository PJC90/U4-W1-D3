package es1;

import etities.Chiamataq;
import etities.Rettangolo;
import etities.Sim;

public class Main {
    public static void main(String[] args) {

        Rettangolo a = new Rettangolo(4,2);
        Rettangolo b = new Rettangolo(10,2, 5,2);
        a.stampaRettangolo();
        b.stampaDueRettangoli();
        Rettangolo aa = new Rettangolo(4,2);
        if(a.equals(aa)){
            System.out.println("fuck");
        } else {
            System.out.println("sto ca");
        }
//        System.out.println(a.altezza);è private non posso leggerlo
        System.out.println(b.getAltezza());
        b.setAltezza(11);
        System.out.println(b.getAltezza());
    }
}

