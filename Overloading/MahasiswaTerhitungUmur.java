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
class MahasiswaTerhitungUmur extends Mahasiswa {

    // Konstruktor overloaded untuk menghitung tahun lahir berdasarkan umur
    public MahasiswaTerhitungUmur(String nama, int umur, int tahunSaatIni) {
        super(nama, tahunSaatIni - umur);
    }
}
