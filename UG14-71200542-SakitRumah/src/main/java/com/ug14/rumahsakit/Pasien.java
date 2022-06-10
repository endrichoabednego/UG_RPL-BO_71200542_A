package com.ug14.rumahsakit;

public class Pasien {
    private Integer rm;
    private String nama;
    private Integer usia;
    private String alamat;
    private String penyakit;
    private Integer levelPenyakit;
    private Boolean status;

    public Pasien( String nama, int usia, String alamat, String penyakit) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
        this.status = false;
    }

    public Pasien(String nama, int usia, String alamat) {
    }

    public static int getLevelPenyakit() {
        return 0;
    }

    public boolean getStatus() {
        return false;
    }

    public int getStatusDaftar() {
        return 0;
    }

    public void setStatus(boolean b) {
    }

    public void setLevelPenyakit(int i) {
    }
}
