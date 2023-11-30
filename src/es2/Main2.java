package es2;
import etities.Chiamataq;
import etities.Sim;

public class Main2 {

        public static void main(String[] args) {

            Sim z = new Sim(3331212);

            Chiamataq c1 = new Chiamataq(111,2);
            Chiamataq c2 = new Chiamataq(222, 50);
            z.chiamate = new Chiamataq[]{c1,c2};
            z.stampaSim();

        }

}
