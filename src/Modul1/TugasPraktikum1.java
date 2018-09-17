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
public class TugasPraktikum1 {
    public static void main(String[] args) {
        System.out.print("Program Java Penghitung Luas Permukaan Bola");
        System.out.print("\nMasukkan jari - jari bola : ");
        Scanner masukan = new Scanner(System.in);
        double jari = masukan.nextDouble();
        System.out.println("Luas Permukaan Bola adalah "+ jari*jari*22/7*4);
        
    }
}
