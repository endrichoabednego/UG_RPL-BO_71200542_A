import java.util.Scanner;

public class Main {
    public static void main(String argsp[]) {
        TabunganKonvensional E_71200542 = new TabunganKonvensional();
        TabunganBerjangka A_71200542 = new TabunganBerjangka();
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan:\n" +
                "1. Penyetoran\n" +
                "2. Penarikan\n" +
                "3. Lihat saldo\n" +
                "Masukkan pilihan: ");
        int pilihan = input.nextInt();
        if(pilihan == 1) {
            E_71200542.penyetoran(200000);
            A_71200542.penyetoran(1000000);
        } else if(pilihan == 2) {
            E_71200542.penarikan(50000);
            A_71200542.penarikan(50000);
        } else if(pilihan == 3) {
            System.out.print("Saldo E_71200542: ");
            E_71200542.getSaldo();
            System.out.print("Saldo A_71200542: ");
            A_71200542.getSaldo();
        }  else {
            System.out.println("Pilihan anda tidak valid");
        }



    }
}