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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ipk,ipk1,ipk2,ipk3,ipk4,ipk5,ipk6,ipk7,ipk8;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan IPK semseter 1 : ");
        ipk1 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 2 : ");
        ipk2 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 3 : ");
        ipk3 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 4 : ");
        ipk4 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 5 : ");
        ipk5 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 6 : ");
        ipk6 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 7 : ");
        ipk7 = scan.nextDouble();
        System.out.print("Masukan IPK semseter 8 : ");
        ipk8 = scan.nextDouble();
        
        ipk=(ipk1+ipk2+ipk3+ipk4+ipk5+ipk6+ipk7+ipk8)/8;
        if(ipk>=3.80 && ipk<=4.00){
            System.out.println("Summa Cum Laude, IPK : "+ipk);
        }else if(ipk>=3.60 && ipk<=3.79){
            System.out.println("Magna Cum Laude, IPK :  "+ipk);
        }else if(ipk>=3.40 && ipk<=3.59){
            System.out.println("Cum Laude, IPK : "+ipk);
        }else if(ipk>=3.20 && ipk<=3.39){
            System.out.println("High Merit, IPK : "+ipk);
        }else if(ipk<=3.19){
            System.out.println("Merit, IPK : "+ipk);
        }
    }
    
}
