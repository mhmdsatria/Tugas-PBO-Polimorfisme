/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author marse
 */
public class Main {

    public static void main(String[] args) {
        Person orang = new Person("Muhamad Satria");
        Person mahasiswa = new Student("Tile", "12345");
        orang.perkenalkan();
        mahasiswa.perkenalkan();
    }
}
