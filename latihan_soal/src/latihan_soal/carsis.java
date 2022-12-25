package latihan_soal;

import java.util.Scanner;

public class carsis {
    public static void main(String[] args) {
        int karmob,karmot,jumlahmob, jumlahmot;
     //  double penghasilBulan ; 
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan karmob = ");
        karmob = input.nextInt();
        System.out.print("masukkan karmot = ");
        karmot = input.nextInt();
        System.out.print("masukkan jumlahmob = ");
        jumlahmob = input.nextInt();
        System.out.print("masukkan jumlamot = ");
        jumlahmot = input.nextInt();
    //   System.out.println("penhasibul:");
     // penghasilBulan = input.nextDouble();
   
        
        int hasil1 = karmot*jumlahmot;
        System.out.println("hasil1 " + hasil1);
        int hasil2 = karmob*jumlahmob;
        System.out.println("hasil2 " + hasil2);
        int hasil = hasil1+hasil2;
        System.out.println("hasil " + hasil);
        int totalkor = hasil * 10/100;
        System.out.println("totalkor " + totalkor);
        int totalber = totalkor*30;
        System.out.println("hasil akhir = " + totalber);
        
       
    }
    
}
