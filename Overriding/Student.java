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
public class Student extends Person {
    private String idMahasiswa; // Mengubah tipe data menjadi String

    public Student(String nama, String idMahasiswa) { // Mengubah tipe data parameter menjadi String
        super(nama);
        this.idMahasiswa = idMahasiswa;
    }

    @Override
    public void perkenalkan() {
        System.out.println("Saya sering dipanggil dengan nama " + nama + " NIM saya " + idMahasiswa); // Memperbarui pesan perkenalan
    }
}


