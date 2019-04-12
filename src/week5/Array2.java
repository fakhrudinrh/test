/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);
        for(int bar=0; bar<meja.length; bar++){
            for(int kol=0; kol<meja[bar].length; kol++){
                System.out.println("Siapa yang akan duduk di meja ("+kol+","+bar+")");
                meja[bar][kol] = scan.nextLine();
            }
        }
        System.out.println("===========================");
        for(int bar=0; bar<meja.length;bar++){
            for(int kol=0; kol<meja[bar].length;kol++){
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("==========================");
    }
    
}
