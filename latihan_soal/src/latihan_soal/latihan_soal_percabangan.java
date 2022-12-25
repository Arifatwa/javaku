package latihan_soal;

import java.util.Scanner;

public class latihan_soal_percabangan {

    public static void main(String[] args) {
        int gaji;
        double gBersih;
        double  potonganPajak = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan gaji anda : ");
        gaji = input.nextInt();

        if (gaji >= 10_000_000 && gaji < 20_000_000) {
            potonganPajak = gaji * 2 / 100;
            gBersih = gaji - potonganPajak;

        } else if (gaji >= 20_000_000) {
            potonganPajak = gaji * 5 / 100;
            gBersih = gaji - potonganPajak;

        } else {
            gBersih = gaji;
        }
        System.out.println("Total Potongan Pajak: " + potonganPajak);
        System.out.println("Gaji Bersih Sebulan: " + gBersih);
    }
}


