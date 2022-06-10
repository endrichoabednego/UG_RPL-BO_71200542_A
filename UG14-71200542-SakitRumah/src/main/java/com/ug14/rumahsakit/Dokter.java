package com.ug14.rumahsakit;

public class Dokter {

    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;


    public void memeriksa(Pasien pasien, Jadwal jadwal) {
        if(jadwal.getStatusScreening() && jadwal.getDokter().equals(this)){
            if(Pasien.getLevelPenyakit() == 0){
                pasien.setStatus(true);
            }else {
                pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
            }
        }else {
            System.out.println(
                    "====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYAN===================="
            );
        }
    }

    public void cekStatus(Pasien pasien, Jadwal jadwal) {
        if (pasien.getStatus()){
            System.out.println("================SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT================");
        }else {
            System.out.println("================PASIEN ANDA MASIH SAKIT================");
        }
    }


    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;

        }

}


  