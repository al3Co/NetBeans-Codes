package datos;

public class Consumidor implements Runnable{
    Thread hilo2;
    Datos dtos;
    public Consumidor(Datos d){
        dtos=d;
        hilo2=new Thread(this);
        hilo2.start();
    }
    public void run(){
        for(int i=1;i<4;i++){
            dtos.quitar(i);
        }
    }
}