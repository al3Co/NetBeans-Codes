package datos;

public class Productor implements Runnable{
    Thread hilo1;
    Datos dtos;
    int num=0;
    public Productor(Datos d){
        dtos=d;
        hilo1=new Thread(this);
        hilo1.start();
    }
    public void run(){
        for(int i=1;i<4;i++){
            dtos.poner(i);
        }
    }
}