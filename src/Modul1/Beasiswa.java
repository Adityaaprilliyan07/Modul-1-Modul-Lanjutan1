/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Beasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();
        if((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa Dapat Beasiswa");
        else
            System.out.println("Siswa Tidak Dapat Beasiswa : ");
        
    }
}
