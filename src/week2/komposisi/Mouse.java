/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.komposisi;

/**
 *
 * @author ASUS
 */
public class Mouse {
    private String merk;

    public Mouse() {
    }

    public Mouse(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public String toString() {
        return "Mouse{" + "merk=" + merk + '}';
    }
    
    
}