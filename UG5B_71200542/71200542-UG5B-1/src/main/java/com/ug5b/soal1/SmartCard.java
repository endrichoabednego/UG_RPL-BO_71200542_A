package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private long saldo;
    private Voucher kode;
    private Voucher nominal;

    public void topUp(Voucher vch) {
        if (vch.getKode().equals("VC")) {
            System.out.println("Kode Vouher : "+ vch.getKode() + " || Top up gagal! Kode Voucher tidak valid.");
        }
        else {
            String membagi = vch.getKode().substring(2);
            this.saldo = saldo + Long.parseLong(membagi);
            System.out.println("Kode Voucher : "+ vch.getKode() + " || Top up sukses!");
        }
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }


}
