package etities;

import java.util.Random;

public class Rettangolo {
    private int altezza;
    private int larghezza;
    private int altezza2;
    private int larghezza2;
    private int id;

    public Rettangolo(int altezza, int larghezza){
        Random r = new Random();
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.id = r.nextInt(1,1000000);
    }
    public Rettangolo(int altezza, int larghezza, int altezza2, int larghezza2){
        Random r = new Random();
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.altezza2 = altezza2;
        this.larghezza2 = larghezza2;
        this.id = r.nextInt(1,1000000);
    }


    public void stampaRettangolo(){
        System.out.println("Area:"+ ((this.larghezza * this.altezza )*2));
        System.out.println("Perimetro:"+((this.altezza + this.larghezza)*2));
    }
    public void stampaDueRettangoli(){
        System.out.println("Area 1 rettangolo:"+ ((this.larghezza * this.altezza )*2));
        System.out.println("Perimetro 1 rettangolo:"+((this.altezza + this.larghezza)*2));
        System.out.println("Area 2 rettangolo:"+ ((this.larghezza2 * this.altezza2 )*2));
        System.out.println("Perimetro 2 rettangolo:"+((this.altezza2 + this.larghezza2)*2));
        System.out.println("somma areee:"+ (((this.larghezza * this.altezza )*2)+((this.larghezza2 * this.altezza2 )*2)));
        System.out.println("somma perimetri:"+(((this.altezza + this.larghezza)*2)+((this.altezza2 + this.larghezza2)*2)));
    }
}
