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
public class Persegi extends BangunDatar{

    public Persegi(double s, double a, double t, double p, double l, double r) {
        super(s, a, t, p, l, r);
    }

    

    public Persegi() {
    }
    
    
    public void bentuk(){
        System.out.println("Bentuk bangun persegi");
        int p = 3;
        int l = 3;
        
        for(int i=0; i<p; i++){
            for(int j=0; j<l; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public int luas(int s){
        return(s*s);
    }
    public void luas(){
        double s = super.getS();
        double luas = s*s;
        System.out.println("Luas persegi = "+luas);
    }
    public void kel(){
        double s = super.getS();
        double kel = s*4;
        System.out.println("Keliling persegi = "+kel);
    
    }
}
