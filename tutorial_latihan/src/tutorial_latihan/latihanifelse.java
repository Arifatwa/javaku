package tutorial_latihan;

import java.util.Scanner;

public class latihanifelse {
    public static void main(String[] args) {
        String hari;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan hari : ");
        hari = input.nextLine();
     
        if (hari == "senin"){
            System.out.println("masih libur");
        }else if (hari == "selasa"){
            System.out.println("Mata kuliah ada dua");
        }else if (hari == "rabu"){
            System.out.println("Tiga mata kuliah gess");
        }else if (hari == "kamis"){
            System.out.println("Dua mata kuliah");
        }else if (hari == "jum'at"){
            System.out.println("satu ji mata kuliah masuk");
        }else if (hari == "sabtu"){
            System.out.println("Libur kulah, bukan dengan tugas");
        }else if (hari == "minggu"){
            System.out.println("Libur hanyalah hayalan");
        }else{
            System.out.println("maaf anda salah ");
        }
                
                
                
}
}
