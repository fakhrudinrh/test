/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainPerson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person1 pr = new Person1();
        System.out.println("Masukkan Nama Kamu: ");
        Scanner input = new Scanner(System.in);
        pr.setNama(input.next());
        System.out.println("Masukkan Alamat Kamu: ");
        pr.setAddress(input.next());
        System.out.println("Masukkan Umur Kamu: ");
        pr.setAge(input.next());
        System.out.println("Masukkan NRP Kamu: ");
        pr.setNrp(input.next());
       System.out.println(pr.toString());
    }
    
}
