/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

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
        int roda,harga,jenis,sewa,total,uang,kembalian;
        Motor mtr1 = new Motor("Honda Vario");
        Motor mtr2 = new Motor("Honda Beat");
        Motor mtr3 = new Motor("Aerox");
        
        Mobil mbl1 = new Mobil("Ferrari");
        Mobil mbl2 = new Mobil("Avanza");
        Mobil mbl3 = new Mobil("Sedan");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah uang anda : ");
        uang = scan.nextInt();
        System.out.println("1. Roda 2");
        System.out.println("2. Roda 4");
        System.out.print("Pilih roda kendaraan [1/2]: ");
        roda = scan.nextInt();
        kembalian=0;
        
        switch(roda){
            case 1 :
                System.out.println("1. "+mtr1.getNama());
                System.out.println("2. "+mtr2.getNama());
                System.out.println("3. "+mtr3.getNama());
                harga = 50000;
                System.out.print("Piih jenis motor[1/2/3]: ");
                jenis = scan.nextInt();
                System.out.print("Lama sewa [angka]: ");
                sewa = scan.nextInt();
                total = sewa*harga;
                kembalian = uang-total;
                switch(jenis){
                    case 1:
                        System.out.println("=================================");
                        System.out.println("Jenis Kendaraan : "+mtr1.getNama());
                        System.out.println("Lama sewa : "+sewa+" Hari");
                        System.out.println("Total kembalian : Rp."+kembalian);
                        System.out.println("Total Harga sewa : Rp."+total);
                        break;
                    case 2:
                        System.out.println("=================================");
                        System.out.println("Jenis Kendaraan : "+mtr2.getNama());
                        System.out.println("Lama sewa : "+sewa+" Hari");
                        System.out.println("Total kembalian : Rp."+kembalian);
                        System.out.println("Total Harga sewa : Rp."+total);
                        break;
                    case 3:
                        System.out.println("=================================");
                        System.out.println("Jenis Kendaraan : "+mtr3.getNama());
                        System.out.println("Lama sewa : "+sewa+" Hari");
                        System.out.println("Total kembalian : Rp."+kembalian);
                        System.out.println("Total Harga sewa : Rp."+total);
                        break;
                    default:
                        System.out.println("Input Salah");
                }
                break;
            case 2 :
                System.out.println("1. "+mbl1.getNama());
                System.out.println("2. "+mbl2.getNama());
                System.out.println("3. "+mbl3.getNama());
                harga = 100000;
                System.out.print("Piih jenis mobil[1/2/3]: ");
                jenis = scan.nextInt();
                System.out.print("Lama sewa [angka]: ");
                sewa = scan.nextInt();
                total = sewa*harga;
                kembalian = uang-total;
                switch(jenis){
                    case 1:
                        System.out.println("=================================");
                        System.out.println("Jenis Kendaraan : "+mbl1.getNama());
                        System.out.println("Lama sewa : "+sewa+" Hari");
                        System.out.println("Total kembalian : Rp."+kembalian);
                        System.out.println("Total Harga sewa : Rp."+total);
                        break;
                    case 2:
                        System.out.println("=================================");
                        System.out.println("Jenis Kendaraan : "+mbl2.getNama());
                        System.out.println("Lama sewa : "+sewa+" Hari");
                        System.out.println("Total kembalian : Rp."+kembalian);
                        System.out.println("Total Harga sewa : Rp."+total);
                        break;
                    case 3:
                        System.out.println("=================================");
                        System.out.println("Jenis Kendaraan : "+mbl3.getNama());
                        System.out.println("Lama sewa : "+sewa+" Hari");
                        System.out.println("Total kembalian : Rp."+kembalian);
                        System.out.println("Total Harga sewa : Rp."+total);
                        break;
                    default:
                        System.out.println("Input Salah");
                }
                break;
            default:
                System.out.println("Input salah");
        }
        
    }
    
}
