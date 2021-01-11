package com.amanda;

import java.util.Scanner;

// class konversi_detik turunan dari class time dan mengimplementasi interface operasi
public class Konversi_detik extends Time implements Operasi{

    @Override
    public void konversi(){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("----------Konversi Detik----------");
        System.out.print("Masukkan waktu dalam detik : "); // menginputkan waktu dalam detik
        detik = input.nextInt();

        menit = detik/60; //rumus konversi detik ke menit
        jam = detik/3600; //rumus konversi detik ke jam

        System.out.println();
        System.out.println("==========HASIL KONVERSI=========="); //outputnya
        System.out.println(detik + " detik : " + menit + " menit");
        System.out.println(detik + " detik : " + jam + " jam");
    }
}
