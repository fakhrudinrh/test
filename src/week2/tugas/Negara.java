/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.tugas;

/**
 *
 * @author ASUS
 */
public class Negara {
    private String nama;
    private Benua benua;
    private Provinsi provinsi;
    private Kota kota;

    public Negara() {
    }

    public Negara(String nama, Benua benua, Provinsi provinsi, Kota kota) {
        this.nama = nama;
        this.benua = benua;
        this.provinsi = provinsi;
        this.kota = kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Benua getBenua() {
        return benua;
    }

    public void setBenua(Benua benua) {
        this.benua = benua;
    }

    public Provinsi getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(Provinsi provinsi) {
        this.provinsi = provinsi;
    }

    public Kota getKota() {
        return kota;
    }

    public void setKota(Kota kota) {
        this.kota = kota;
    }

    @Override
    public String toString() {
        return "Negara{" + "nama=" + nama + ", benua=" + benua + ", provinsi=" + provinsi + ", kota=" + kota + '}';
    }
    
    
    
    
}
