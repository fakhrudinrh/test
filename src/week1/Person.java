package week1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Person {
    
    private String name;
    private String address;
    private String nhp;
    private int age;

    public Person() {
    }

    public Person(String name, String address, String nhp, int age) {
        this.name = name;
        this.address = address;
        this.nhp = nhp;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNhp() {
        return nhp;
    }

    public void setNhp(String nhp) {
        this.nhp = nhp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", nhp=" + nhp + ", age=" + age + '}';
    }
    
    
}
