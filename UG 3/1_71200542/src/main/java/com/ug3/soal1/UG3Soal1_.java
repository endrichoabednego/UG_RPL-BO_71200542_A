package com.ug3.soal1;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class UG3Soal1_ {
    public static void main(String[] args) {
        System.out.println("Absen disini ");
        Scanner inp = new Scanner(System.in);
        System.out.print("Nama Karyawan : ");
        String krywan = inp.nextLine();
        DateFormat formatjam = new SimpleDateFormat("hh:mm:ss aa");
        String frmtJam = formatjam.format(new Date()).toString();
        DateFormat formatTgl = new SimpleDateFormat("dd-MMMMMMMMMMMMMMMMM-yyyy");
        String formatTangg = formatTgl.format(new Date()).toString();
        System.out.println("berhasil absensi");
        System.out.println("Atas nama : " + krywan);
        System.out.println("Pada tanggal : " + formatTangg);
        System.out.println("Pukul : " + frmtJam);
    }
}
