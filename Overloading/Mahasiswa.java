/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overloading;

/**
 *
 * @author marse
 */
public class Mahasiswa {

    protected String nama;
    protected int tahunLahir;

    // Konstruktor dengan nama dan tahun lahir
    public Mahasiswa(String nama, int tahunLahir) {
        this.nama = nama;
        this.tahunLahir = tahunLahir;
    }

    // Menampilkan informasi mahasiswa
    public void tampilkanInfo(int tahunSaatIni) {
        int umur = hitungUmur(tahunSaatIni);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    // Menghitung umur berdasarkan tahun lahir
    protected int hitungUmur(int tahunSaatIni) {
        return tahunSaatIni - tahunLahir;
    }
}

