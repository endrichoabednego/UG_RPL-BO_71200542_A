import java.util.Scanner;

public class hitungGaji_71200542_A {
    public static void main(String[]argsp){
        int totalgaji = 300000;
        Scanner inp = new Scanner(System.in);
        System.out.println("Berapa Karyawan :");
        int totKaryawan = inp.nextInt();
        for (int i = 1; i<=totKaryawan; i++ )
            System.out.println("Masukkan jumlah jam kerja");
            int totJamKerja = inp.nextInt();
            totalgaji = totalgaji + totJamKerja;
            if (totJamKerja > 8) {
                int jamextra = totJamKerja - 8 ;
                int gajiextra = totalgaji - 15000 ;
                System.out.println("extra jam :"+jamextra);
                System.out.println("extra gaji :"+gajiextra);
                System.out.println("-------");
            } else if (totJamKerja<8) {
                int jamkurang = 8 - totJamKerja;
                int mingaji = totalgaji - 15000;
                System.out.println("Less Hours : "+jamkurang);
                System.out.println("potongan gaji : "+mingaji);
                System.out.println("----");
            }
            else if (totJamKerja == 8) {
                System.out.println("total Gaji : "+totalgaji);
            }


    }

}
