package latihan_soal;

import java.util.Scanner;

public class manusia {
    public static void main(String[] args) {
  // belajar operator aritmatika
        int a;
        int b;
        int hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("kalkulator sederhana");
        System.out.print("masukkan nilai a : ");
        a = input.nextInt();
        System.out.print("masukkan nilai b : ");
        b = input.nextInt();
        
        // penjumlahan
        hasil = a + b;
        System.out.println("a + b = " + hasil );
        
        // pengurangan
        hasil = a - b;
        System.out.println("a - b = " + hasil );
        
        // perkalian
        hasil = a * b;
        System.out.println("a x b = " + hasil);
        
        // pembagian
        hasil = a / b;
        System.out.println("a / b = " + hasil);
        
        // modulus (sisa bagi)
        hasil = a % b;
        System.out.println("a & b = " + hasil);

        
        
        
        
        
    }
}
