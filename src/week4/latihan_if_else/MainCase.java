/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.latihan_if_else;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hari;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input nama hari : ");
        hari = scan.nextLine();
        
        switch(hari){
            case "senin":
                System.out.println("libur");
                break;
            case "selasa":
                System.out.println("OOP dan PCD");
                break;
            case "rabu":
                System.out.println("RPL dan PBD");
                break;
            case "kamis":
                System.out.println("B.Inggris");
                break;
            case "jumat":
                System.out.println("B.Indonesia dan Lab OOP");
                break;
            case "sabtu":
                System.out.println("Lab PCD dan Lab PBD");
                break;
            default:
                System.out.println("Input Salah");
        }
    }
    
}
