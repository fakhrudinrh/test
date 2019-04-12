/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.tugas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class MainDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mh = new Mahasiswa("1520171326","  Amar Maulana","1234","Cirebon");
        mh.isiArray("001", "OOP", "11");
        mh.isiArray("002", "PCD", "8");
        
        System.out.println("NRP  : "+mh.getNrp());
        System.out.println("Nama : "+mh.getNama());
        System.out.println("No HP: "+mh.getNotlp());
        System.out.println("alamat : "+mh.getAlamat());
        mh.lihatArray();
       
        
    }
    
}
