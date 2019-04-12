/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author ASUS
 */
public class MainBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar b = new BangunDatar();
        //Persegi p = new Persegi();
        //Segitiga s = new Segitiga();
        
        //b.bentuk();
        //b = p;
        b.bentuk();
        //b = s;
        b.bentuk();
        
        //Persegi pl = new Persegi();
        Persegi p2 = new Persegi();
        p2.setS(5);
        p2.luas();
        p2.kel();
        
        Segitiga s2 = new Segitiga();
        s2.setA(6);
        s2.setT(2);
        s2.luas();
        
        PersegiPanjang pl = new PersegiPanjang();
        pl.setP(4);
        pl.setL(6);
        pl.luas();
        pl.kel();
        
        Lingkaran l = new Lingkaran();
        l.setR(7);
        l.luas();
        l.kel();
    }
    
}
