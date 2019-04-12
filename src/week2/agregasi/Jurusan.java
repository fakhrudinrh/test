/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.agregasi;

/**
 *
 * @author ASUS
 */
public class Jurusan {
    private String ksJurusan;
    private String namaJurusan;
    private Mahasiswa mhs;

    public Jurusan() {
    }

    public Jurusan(String ksJurusan, String namaJurusan, Mahasiswa mhs) {
        this.ksJurusan = ksJurusan;
        this.namaJurusan = namaJurusan;
        this.mhs = mhs;
    }

    public String getKsJurusan() {
        return ksJurusan;
    }

    public void setKsJurusan(String ksJurusan) {
        this.ksJurusan = ksJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    @Override
    public String toString() {
        return "Jurusan{" + "ksJurusan=" + ksJurusan + ", namaJurusan=" + namaJurusan + ", mhs=" + mhs + '}';
    }
    
    
}
