package etities;

public class Chiamataq {
    private int numero;
    private int durata;

    public Chiamataq(int numero, int durata){
        this.numero = numero;
        this.durata = durata;
    }
    public int getNumero(){
        return numero;
    }
    public int getDurata(){
        return durata;
    }

    @Override
    public String toString() {
        return "Chiamataq{" +
                "numero=" + numero +
                ", durata=" + durata +
                '}';
    }
}
