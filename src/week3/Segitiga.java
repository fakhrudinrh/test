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
public class Segitiga extends BangunDatar{

    public Segitiga(double s, double a, double t, double p, double l, double r) {
        super(s, a, t, p, l, r);
    }

    public Segitiga() {
    }
    
    
    public void bentuk(){
        System.out.println("Bentuk bangun segitiga");
        int a = 3;
        for(int i=0; i<a; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void luas(){
        double a = super.getA();
        double t = super.getT();
        double luas = a*t/2;
        System.out.println("Luas Segitiga = "+luas);
    }
    
}
