/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.komposisi;

/**
 *
 * @author ASUS
 */
public class MainKomputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CPU cpu = new CPU("Cpu1");
        Keyboard kb = new Keyboard("Keyboard1");
        Mouse mouse = new Mouse("Mouse1");
        Komputer cmp = new Komputer("Komputer1", mouse, cpu, kb);
        
        System.out.println(cmp.toString());
    }
    
}
