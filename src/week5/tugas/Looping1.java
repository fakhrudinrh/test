/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.tugas;

/**
 *
 * @author ASUS
 */
public class Looping1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<=6; i++){
            for(int j=0; j<i; j++){
                System.out.print(+j+1);
            }
            System.out.println("");
        }
    }
    
}
