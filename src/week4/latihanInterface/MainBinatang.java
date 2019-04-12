/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.latihaninterface;

/**
 *
 * @author Mikael Prapaskalis
 */
public class MainBinatang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck ("Angsa", "Cirebon");
        Dog dog = new Dog ("Anjing", "Ciwuwa");
        Cat cat = new Cat ("Simanis", "Persia");
        
        System.out.println(cat);
        cat.suara();
        System.out.println(duck);
        duck.suara();
        System.out.println(dog);
        dog.suara();
    }
    
}
