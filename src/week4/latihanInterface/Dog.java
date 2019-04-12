/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.latihaninterface;

/**
 *
 * @author Mikael Prapaskalis
 */
public class Dog implements Binatang {
    private String name;
    private String breed;

    public Dog() {
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", umur=" +  umur_dog + ')';
    }
    
    @Override
    public void suara() {
        System.out.println("Guk...guk...guk...");
    }
}
