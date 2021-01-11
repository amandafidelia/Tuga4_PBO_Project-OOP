package com.amanda;

import java.util.Scanner;

// class konversi_jam turunan dari class time dan mengimplementasi interface operasi
public class Konversi_jam extends Time implements Operasi{

    @Override
    public void konversi(){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("----------Konversi Jam----------");
        System.out.print("Masukkan waktu dalam jam : "); // menginputkan waktu dalam jam
        jam = input.nextInt();

        menit = jam*60; // rumus konversi jam ke menit
        detik = jam*3600; // rumus konversi jam ke detik

        System.out.println();
        System.out.println("=========HASIL KONVERSI========="); // outputnya
        System.out.println(jam + " jam : " + menit + " menit");
        System.out.println(jam + " jam : " + detik + " detik");
    }
}
