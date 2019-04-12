/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.asosiasi;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    private String nama;
    private String nrp;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", nrp=" + nrp + '}';
    }
    
    
}
