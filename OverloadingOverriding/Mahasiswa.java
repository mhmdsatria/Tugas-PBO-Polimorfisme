/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OverloadingOverriding;

/**
 *
 * @author marse
 */
public class Mahasiswa extends UniversitasNSP {
    private int nim;

    public Mahasiswa(String nama, int nim) {
        super(nama);
        this.nim = nim;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama + " (NIM: " + nim + ")");
    }
}
