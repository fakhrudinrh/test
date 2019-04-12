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
public class Lingkaran extends BangunDatar{

    public Lingkaran(double s, double a, double t, double p, double l, double r) {
        super(s, a, t, p, l, r);
    }

    public Lingkaran() {
    }
    public void luas(){
        double r = super.getR();
        double luas = 3.14*r*r;
        System.out.println("Luas Lingkaran = "+luas);
    }
    public void kel(){
        double r = super.getR();
        double kel = 2*3.14*r;
        System.out.println("Keliling Lingkaran = "+kel);
    }
}
