package datos;

public class Main {
    public static void main (String args[]){
        Datos d=new Datos();
        Productor p=new Productor(d);
        Consumidor c=new Consumidor(d);
    }
}