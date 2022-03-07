/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123200137_tugas2;

import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

/**
 *
 * @author Nada
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        int pilih, ulang;
        float panjang, lebar, tinggi, jari;
        
        Scanner input = new Scanner(System.in);
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("======================");
            System.out.println("      MENU UTAMA");
            System.out.println("======================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            if (pilih == 1){
                System.out.print("Input Panjang \t= ");
                panjang = input.nextInt();
                System.out.print("Input Lebar \t= ");
                lebar = input.nextInt();
                System.out.print("Input Tinggi \t= ");
                tinggi = input.nextInt();
                Balok balok = new Balok(tinggi, lebar, panjang);
                System.out.println("Luas Persegi Panjang \t= " + balok.luas());
                System.out.println("Keliling Persegi Panjang \t= " + balok.keliling());
                System.out.println("Volume Balok \t\t= " + balok.volume());
                System.out.println("Luas Permukaan Balok \t= " + balok.luaspermukaan());

            } else if (pilih == 2){
                System.out.print("Input Tinggi \t= ");
                tinggi = input.nextInt();
                System.out.print("Input Jari-jari \t= ");
                jari = input.nextInt();
                Tabung tabung = new Tabung(tinggi, jari);
                System.out.println("Luas Lingkaran \t\t= " + tabung.luas());
                System.out.println("Keliling Lingkaran \t= " + tabung.keliling());
                System.out.println("Volume Tabung \t\t= " + tabung.volume());
                System.out.println("Luas Permukaan Tabung \t= " + tabung.luaspermukaan());

            } else if (pilih == 0){
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia!!!!");
            }
            System.out.println("\n");
            System.out.print("Ulangi? (Ya:1 || Tidak:0) ");
            ulang = input.nextInt();
        }
        while(ulang == 1);
    }
    
}
