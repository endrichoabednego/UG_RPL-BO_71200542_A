package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayanan;

    public Pelayanan(int idPelayanan, String nama) {
        this.idPelayanan = idPelayanan;
        this.nama = nama;
    }

    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }



    public void mengaturJadwal(Pasien p, Dokter d, Suster s, Jadwal j) {
        if (p.getStatus() == false) {
            j.setStatusDaftar(true);
            j.setPasien(p);
            j.setDokter(d);
            j.setSuster(s);
            System.out.println("Data Jadwal Berhasil Disimpan");
            System.out.println("=======Proses Pengaturan Jadwal Berhasil======");
        }
    }

    public Pasien registrasi() {
        Scanner inp5 = new Scanner(System.in);
        System.out.print("RM : ");
        int RM = inp5.nextInt();
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukan Nama anda: ");
        String nama = inp.nextLine();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Masukan Usia anda: ");
        int usia = inp2.nextInt();
        Scanner inp3 = new Scanner(System.in);
        System.out.println("Masukan alamat anda: ");
        String alamat = inp3.nextLine();
        Scanner inp4 = new Scanner(System.in);
        System.out.println("Masukan penyakit anda: ");
        String penyakit = inp4.nextLine();
        System.out.println("Data Pasien berhasil Disimpan!");
        System.out.println("========Proses registrasi berhasil=========");
        return new Pasien(nama, usia, alamat, penyakit);
    }
}