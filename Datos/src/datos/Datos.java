package datos;

public class Datos {
    double [] ad;
    int contador = -1;
    public Datos(){
        ad=new double[4];
    }
    public synchronized void poner(double d){
        while(contador >= ad.length-1){
            try {
                wait();
            }
            catch(InterruptedException e){
            }
        }
        while(contador < ad.length-1){
            contador ++;
            ad[contador]=d*10+contador;
        }
        notify();
    }
    public synchronized void quitar (double d){
        while(contador <0){
            try {
                wait();
            }
            catch(InterruptedException e){
            }
        }
        while(contador >=0){
            d= ad[contador];
            contador--;
            System.out.println("Consume"+d);
        }
        notify();
    }
}