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
public class UniversitasNSP {
    protected String nama;

    public UniversitasNSP(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("Anggota Kelas TI22A: " + nama);
    }
}
