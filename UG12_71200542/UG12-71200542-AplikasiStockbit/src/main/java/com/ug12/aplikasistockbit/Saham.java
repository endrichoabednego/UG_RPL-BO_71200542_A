package com.ug12.aplikasistockbit;

public class Saham {
    public long harga;
    public String kode;

    public long getHarga() {
        return harga;
    }

    public String getKode() {
        return kode;
    }

    public Saham(String kode, long harga) {
        this.harga = harga;
        this.kode = kode;
    }
}
