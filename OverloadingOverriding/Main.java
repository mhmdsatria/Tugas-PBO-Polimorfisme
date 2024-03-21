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
public class Main {
    public static void main(String[] args) {
        UniversitasNSP[] anggota = new UniversitasNSP[3];
        anggota[0] = new UniversitasNSP("Muhamad Satria");
        anggota[1] = new UniversitasNSP("Fadya Amar");
        anggota[2] = new UniversitasNSP("Dede Zaenal");

        System.out.println("Anggota Kelas TI22A Jurusan Teknik Informatika:");
        for (UniversitasNSP member : anggota) {
            member.tampilkanInfo();
        }

        System.out.println("Mahasiswa:");
        for (UniversitasNSP member : anggota) {
            if (member instanceof Mahasiswa) {
                member.tampilkanInfo();
            }
        }
    }
}
