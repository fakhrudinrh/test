/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.tugas;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Benua benua = new Benua("Asia");
        Provinsi provinsi = new Provinsi("Jawa Barat");
        Kota kota = new Kota("Bandung");
        Negara ngr = new Negara("Indonesia",benua,provinsi,kota);
        
        System.out.println(ngr.toString());
        
    }
    
}
