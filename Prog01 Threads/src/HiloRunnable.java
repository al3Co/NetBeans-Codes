/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AldoC
 */
class HiloRunnable implements Runnable{
    String nombre;
    HiloRunnable(String _nombre){
        nombre = _nombre;
    }
    public void run (){
        for (int i =0; i<4;i++){
            System.out.println(nombre + "" + i);
            try{
                Thread.sleep((int) Math.floor(Math.random()*500)+100);
            }
            catch(InterruptedException e){
            }
        }
    }
}
