/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ASUS
 */
public class Person1 {
    private String nama;
    private String address;
    private String nrp;
    private String age;

    public Person1() {
    }

    public Person1(String nama, String address, String nrp, String age) {
        this.nama = nama;
        this.address = address;
        this.nrp = nrp;
        this.age = age;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" + "nama=" + nama + ", address=" + address + ", nrp=" + nrp + ", age=" + age + '}';
    }
    
    
}
