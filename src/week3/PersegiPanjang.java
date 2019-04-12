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
public class PersegiPanjang extends BangunDatar{

    public PersegiPanjang(double s, double a, double t, double p, double l, double r) {
        super(s, a, t, p, l, r);
    }

    public PersegiPanjang() {
    }
    
    public void luas(){
        double p = super.getP();
        double l = super.getL();
        double luas = p*l;
        System.out.println("Luas Persegi Panjang = "+luas);
    }
    public void kel(){
        double p = super.getP();
        double l = super.getL();
        double kel = 2*(p+l);
        System.out.println("Keliling Persegi Panjang = "+kel);
    
    }
}
