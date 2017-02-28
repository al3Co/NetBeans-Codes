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
        HilosThread procesoA= new HilosThread("Juan ");
        HilosThread procesoB= new HilosThread("Pepe ");
        Thread procesoC = new Thread (new HiloRunnable("C    "));
        Thread procesoD = new Thread (new HiloRunnable("D    "));
        procesoA.start();
        procesoB.start();
        procesoC.start();
        procesoD.start();
    }
}
