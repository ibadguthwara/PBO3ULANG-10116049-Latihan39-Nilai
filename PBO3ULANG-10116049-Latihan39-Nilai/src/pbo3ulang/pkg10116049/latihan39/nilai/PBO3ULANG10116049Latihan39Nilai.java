/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan39.nilai;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi untuk menampilkan Nilai Terbesar Dan Terkecil
 */
public class PBO3ULANG10116049Latihan39Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =======");
        System.out.print("Masukan nama petugas\t\t\t: ");
        String name = scanner.nextLine();

        System.out.print("Masukan banyaknya nilai Mahasiswa\t: ");    
        int jumlah = scanner.nextInt();

        Penilaian penilaian = new Penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        System.out.println();
        System.out.println("======= Hasil Nilai Mahasiswa =======");


        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai Mahasiswa ke-"+ (i+1) + " = " + penilaian.getNilai(i));                
        }


        System.out.println();
        System.out.println("Nilai Terbesar " + penilaian.max());
        System.out.println("Nilai Terkecil " + penilaian.min());
        System.out.println();
        System.out.println("Petugas : " + name);
        
    }
    
}
