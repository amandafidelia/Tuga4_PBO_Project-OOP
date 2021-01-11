package com.amanda;

import java.util.Scanner;

// class konversi_menit turunan dari class time dan mengimplementasi interface operasi
public class Konversi_menit extends Time implements Operasi{

    @Override
    public void konversi(){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("----------Konversi Menit----------");
        System.out.print("Masukkan waktu dalam menit : "); // menginputkan waktu dalam menit
        menit = input.nextInt();

        jam = menit/60; // rumus konversi menit ke jam
        detik = menit*60; // rumus konversi menit ke detik

        System.out.println();
        System.out.println("=========HASIL KONVERSI========="); // outputnya
        System.out.println(menit + " menit : " + jam + " jam");
        System.out.println(menit + " menit : " + detik + " detik");
    }
}
