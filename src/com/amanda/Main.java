package com.amanda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String ulang = " ";
        int pil;
        do{
            System.out.println("**************************");
            System.out.println("\t  MENU UTAMA");
            System.out.println("**************************");
            System.out.println("1. Konversi Jam");
            System.out.println("2. Konversi Menit");
            System.out.println("3. Konversi Detik");
            System.out.println("4. Exit");
            System.out.println("**************************");
            System.out.print("Masukkan menu pilihan anda: "); // inputan pilihan menu
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    Konversi_jam j = new Konversi_jam(); // membuat objek dari class konversi_jam
                    j.konversi();
                    break;
                case 2:
                    Konversi_menit m = new Konversi_menit(); // membuat objek dari class konversi_menit
                    m.konversi();
                    break;
                case 3:
                    Konversi_detik d = new Konversi_detik(); // membuat objek dari class konversi_detik
                    d.konversi();
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    System.exit(0); // untuk exit
                    break;
                default:
                    System.out.print("Maaf, pilihan yang Anda masukkan salah!");
                    break;
            }
            System.out.println();
            System.out.print("Kembali ke menu ?(Y/y) : "); // jika ingin kembali ke menu
            ulang = scan.nextLine();
        }
        while (ulang.equals("y") || ulang.equals("Y"));
    }
    }
