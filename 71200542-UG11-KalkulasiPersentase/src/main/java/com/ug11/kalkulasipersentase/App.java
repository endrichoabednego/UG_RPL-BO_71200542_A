package com.ug11.kalkulasipersentase;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = inp.nextLine();
        String[] isiTeks = teks.split("\\s+");
        String perhitungan = "";
        String persentase = "";
        float hasilakhir = 0;

        for (String i : isiTeks) {
            String cek = String.valueOf(i.charAt(i.length()-1));

            if (cek.equals("%")) {
                perhitungan += i + " + ";
                for (int j = 0; j < i.length() ; j++) {
                    char c = i.charAt(j);
                    if (Character.isDigit(c)) {
                        persentase = persentase + c;
                    } else if (String.valueOf(c).equals(".")) {
                        persentase = persentase + c;
                    } else if (c == '%'){
                        break;
                    };
                }
                if (persentase == null){
                    System.out.println("gagal");
                }else {
                    hasilakhir += Float.parseFloat(persentase);
                }
                persentase = "";
            }

        }

        System.out.println("perhitungan perhitungan: "+ perhitungan.substring(0,perhitungan.length()-2));
        System.out.println("hasilakhir kenaikan (Dalam Persen): " + hasilakhir + "%");

    }
}