package etities;

import java.util.Arrays;

public class Sim {
    private int numero;
    private int credito;
    public Chiamataq[] chiamate;

    public Sim(int numero ){
        this.numero = numero;
        this.credito = 0;
        this.chiamate = new Chiamataq[0];
    }

    public void stampaSim(){
        System.out.println("Numero:" + this.numero);
        System.out.println("Credito:" + this.credito);
        System.out.println("chiamate:" + Arrays.toString(this.chiamate));
    }
}

