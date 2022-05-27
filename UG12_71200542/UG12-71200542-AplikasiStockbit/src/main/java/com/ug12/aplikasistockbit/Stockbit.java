package com.ug12.aplikasistockbit;


import java.util.ArrayList;
import java.util.Map;

public class Stockbit {
    public ArrayList<Investor> arrInvestor;
    public Investor investor;

    public Stockbit() {
        arrInvestor = new ArrayList<>();
    }

    public void register(Investor investor) {
        arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama " + investor.getNama() + " sukses");
    }

    public void login(String username, String password) {
        String status = "tidak bisa";
        for (Investor i : arrInvestor) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password)) {
                this.investor = i;
                status = "bisa";
            }
        }
        if (status == "bisa") {
            System.out.println("login berhasil");
        } else {
            System.out.println("Username/password anda salah");

        }
    }

    public void orderBeli(Saham saham, int lot) {
        investor.getPortfolio().put(saham, lot);
        System.out.println("Order beli " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
    }


    public void printPortfolio() {
        int hasil = 1;
        long hasilbelumakhir = 0;
        System.out.println("=============Portofolio Client==========");
        System.out.println("Client : " + investor.getNama());
        System.out.println("No. \tKode Saham \t Jumlah Lot \tHarga \t Sub Total");
        for (Map.Entry<Saham, Integer> i : investor.getPortfolio().entrySet()) {
            System.out.println(hasil + "\t\t" + i.getKey().getKode() + "\t\t\t" + i.getValue() + "x\t\t\t" + i.getKey().getHarga() + "\t " + (i.getKey().getHarga() * i.getValue() * 100));
            hasilbelumakhir += i.getKey().getHarga() * i.getValue();
            hasil += 1;
        }
        long hasilAkhir = hasilbelumakhir * 100;
        System.out.println("Total Investasi : Rp. " + hasilAkhir);
    }

    public void orderJual(Saham saham, int lot) {
        if (lot < investor.getPortfolio().get(saham)) {
            investor.getPortfolio().put(saham, investor.getPortfolio().get(saham) - lot);
            System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
        }
        else if (lot == investor.getPortfolio().get(saham)) {
            investor.getPortfolio().remove(saham);
            System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
        } else {
            System.out.println("Order jual gagal!");
        }
    }
}