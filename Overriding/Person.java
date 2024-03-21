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
public class Person {
    protected String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    public void perkenalkan() {
        System.out.println("Halo, nama saya " + nama + " alamat rumah saya kp.selabintana wetan");
    }
}


