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
public class BangunDatar {
    private double s;
    private double a;
    private double t;
    private double p;
    private double l;
    private double r;

    public BangunDatar() {
    }

    public BangunDatar(double s, double a, double t, double p, double l, double r) {
        this.s = s;
        this.a = a;
        this.t = t;
        this.p = p;
        this.l = l;
        this.r = r;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    
    public void bentuk(){
        System.out.println("Bentuk bangun datar");
    }
}
