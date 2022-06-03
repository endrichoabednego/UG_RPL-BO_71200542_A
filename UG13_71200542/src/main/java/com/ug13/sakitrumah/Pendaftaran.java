package com.ug13.sakitrumah;
import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public Pengunjung registrasi(){
        Scanner nama = new Scanner(System.in);
        String namaPasien;
        System.out.print("Masukkan nama anda : ");
        namaPasien = nama.nextLine();

        Scanner usia = new Scanner(System.in);
        int usiaPasien;
        System.out.print("Masukkan usia anda : ");
        usiaPasien = usia.nextInt();

        Scanner alamat = new Scanner(System.in);
        String alamatPasien;
        System.out.print("Masukkan alamat anda : ");
        alamatPasien = alamat.nextLine();

        Scanner sakit = new Scanner(System.in);
        String penyakitPasien;
        System.out.print("Masukkan penyakit anda : ");
        penyakitPasien = sakit.nextLine();
        Pengunjung pengunjung = new Pengunjung(namaPasien, usiaPasien, alamatPasien, penyakitPasien);

        System.out.println("=====================Proses Registrasi Anda Berhasil!=====================");
        return pengunjung;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal) {
        if (pengunjung.getStatus()) {
            System.out.println("Pengunjung tidak sakit");

        } else {
            jadwal.setPengunjung(pengunjung);
            jadwal.setPemeriksa(pemeriksa);
            jadwal.setStatusDaftar(true);
            System.out.println("=====================Proses Pengaturan Jadwal Berhasil=====================");
        }
    }
}