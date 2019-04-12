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
public class Dosen {
    private String idDosen;
    private String[] nrpMhs;
    private int jmlMhs;

    public Dosen() {
    }

    public Dosen(String idDosen, String[] nrpMhs, int jmlMhs) {
        this.idDosen = idDosen;
        this.nrpMhs = nrpMhs;
        this.jmlMhs = jmlMhs;
    }

    public String getIdDosen() {
        return idDosen;
    }

    public void setIdDosen(String idDosen) {
        this.idDosen = idDosen;
    }

    public String[] getNrpMhs() {
        return nrpMhs;
    }

    public void setNrpMhs(String[] nrpMhs) {
        this.nrpMhs = nrpMhs;
    }

    public int getJmlMhs() {
        return jmlMhs;
    }

    public void setJmlMhs(int jmlMhs) {
        this.jmlMhs = jmlMhs;
    }

    @Override
    public String toString() {
        return "Dosen{" + "idDosen=" + idDosen + ", nrpMhs=" + nrpMhs + ", jmlMhs=" + jmlMhs + '}';
    }
    
    
}
