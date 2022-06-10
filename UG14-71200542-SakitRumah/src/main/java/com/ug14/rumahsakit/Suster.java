package com.ug14.rumahsakit;

public class Suster {
    private String nama;
    private Integer idSuster;

    public Suster(String nama) {
        this.idSuster = idSuster;
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal) {
        if (pasien.getStatusDaftar() == 1) {
            jadwal.setStatusScreening(true);
            jadwal.setPasien(pasien);
            System.out.println("=======PROSES SCREENING SUSTER======");
        } else {
            System.out.println("=======ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN======");

        }
    }
}
