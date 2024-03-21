/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overloading;

import java.util.Scanner;

/**
 *
 * @author marse
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan tahun kelahiran: ");
            int tahunKelahiran = scanner.nextInt();
            
            System.out.print("Masukkan tahun saat ini: ");
            int tahunSaatIni = scanner.nextInt();
            
            Mahasiswa mahasiswa1 = new Mahasiswa(nama, tahunKelahiran);
            mahasiswa1.tampilkanInfo(tahunSaatIni);
            
            System.out.print("Masukkan umur: ");
            int umur = scanner.nextInt();
            
            Mahasiswa mahasiswa2 = new MahasiswaTerhitungUmur (nama, umur, tahunSaatIni);
            mahasiswa2.tampilkanInfo(tahunSaatIni);
        }
    }
}


