/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ASUS
 */
public class MainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person pr = new Person("Fakhrudin", "Cimahi", "00000", 18);
        
        System.out.println(pr.toString());
        
        Person pr2 = new Person();
        
        pr2.setName("Daniel");
        pr2.setAge(19);
        pr2.setAddress("Bandung");
        pr2.setNhp("0980");
        System.out.println(pr2.toString());
    }
    
}
