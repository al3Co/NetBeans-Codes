/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AldoC
 */
class Hilos {
    public static void main (String args[]){
        HilosThread procesoA= new HilosThread("A ");
        HilosThread procesoB= new HilosThread("B ");
        HilosThread procesoC= new HilosThread("C ");
        HilosThread procesoD= new HilosThread("D ");
        procesoA.start();
        procesoB.start();
        procesoC.start();
        procesoD.start();
        if(procesoA.isAlive()){
            System.out.println("El proceso A entra en un estado de suspendido");
            procesoA.suspend();
        }
        System.out.println("El proceso A se reactiva");
        procesoA.resume();
        System.out.println("Status proceso D "+ procesoD.getState());
        procesoD.stop();
        System.out.println("Status proceso D "+ procesoD.getState());
    }
}