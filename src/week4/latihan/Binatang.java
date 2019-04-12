/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.latihan;

/**
 *
 * @author ASUS
 */
public class Binatang extends hewan{

    @Override
    void duck() {
        System.out.println("Duck{name=Angsa, breed=Cirebon, umur = 1}");
        System.out.println("kwek ... kwek ... kwek ... ");
    }

    @Override
    void cat() {
        System.out.println("Cat{name=Si manis jembatan ancol, breed=Angora, umur = 5}");
        System.out.println("meong ... meong ... meong ... ");
    }

    @Override
    void dog() {
        System.out.println("Dog{name=Si hitam, breed=Ciwawa, umur = 30}");
        System.out.println("gok ... gok ... gok ... ");
    }
    
}
