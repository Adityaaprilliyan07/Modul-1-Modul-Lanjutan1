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
public class TugasPraktikum3 {
    public static void main(String[] args) {
       String Nama,Nis,TempatLahir,TanggalLahir,JenisKelamin,AlamatdiMalang,MottoHidup;
            Scanner biodata = new Scanner (System.in);
             
            System.out.println("Masukkan Data Diri Anda");
            System.out.print("Nama : ");
            Nama =biodata.nextLine();

            System.out.print("Nis : ");
            Nis=biodata.nextLine();

            System.out.print("Tempat Lahir : ");
            TempatLahir = biodata.nextLine();

            System.out.print("Tanggal Lahir : ");
            TanggalLahir = biodata.nextLine();

            System.out.print("Jenis Kelamin : ");
            JenisKelamin = biodata.nextLine();
            
            System.out.print("Alamat di Malang : ");
            AlamatdiMalang = biodata.nextLine();
            
            System.out.print("Motto Hidup : ");
            MottoHidup = biodata.nextLine();
           
            
                        
            System.out.println("============================");
            System.out.println("          Biodataku");
            System.out.println("============================");
            System.out.println("Nama :"+Nama);
            System.out.println("Nis :"+Nis);
            System.out.println("Tempat Lahir :"+TempatLahir);
            System.out.println("Tanggal Lahir :"+TanggalLahir);
            System.out.println("Jenis Kelamin :"+JenisKelamin);
            System.out.println("Alamat di Malang :"+AlamatdiMalang);
            System.out.println("Motto Hidup :"+MottoHidup);
    }
}
