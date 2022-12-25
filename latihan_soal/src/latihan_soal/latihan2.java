package latihan_soal;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
  
        String nama;
        int pasword;
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("Manukkan pasword anda ; ");
        pasword = input.nextInt();
        
        if (nama.equalsIgnoreCase("arifatwa") && pasword == 10){
            System.out.println("selamat nama anda benar...");       
        }else{
            System.out.println("boddoh...");
        }
        }
}
