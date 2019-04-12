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
public class Komputer {
    private String nama;
    private Mouse mouse;
    private CPU cpu;
    private Keyboard keyboard;

    public Komputer(String nama, Mouse mouse, CPU cpu, Keyboard keyboard) {
        this.nama = nama;
        this.mouse = mouse;
        this.cpu = cpu;
        this.keyboard = keyboard;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Komputer{" + "nama=" + nama + ", mouse=" + mouse + ", cpu=" + cpu + ", keyboard=" + keyboard + '}';
    }

    
    
}
