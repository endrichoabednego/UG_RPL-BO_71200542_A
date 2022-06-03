package com.ug13.sakitrumah;


public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal)  {
        if (jadwal.getStatusScreening()){
            if(pengunjung.getLevelPenyakit()==0){
                pengunjung.setStatus(true);
            } else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            }
        } else {
            System.out.println("==================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN==================");
        }
    }

    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getStatus()==true){
            System.out.println("SELAMAT PENGUNJUNG ANDA SUDAH SEMBUH DAN SEHAT");
        } else {
            System.out.println("PENGUNJUNG ANDA MASIH SAKIT");
        }
    }
}
