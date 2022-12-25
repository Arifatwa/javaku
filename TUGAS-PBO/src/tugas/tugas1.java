package tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        String operator;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Operator : ");
        operator = input.nextLine();
        System.out.print("Masukkan angka1 : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka2 : ");
        angka2 = input.nextInt();
        
        if (operator == "+"){
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        }else if (operator == "-"){
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        }else if (operator == "*"){
            hasil = angka1 * angka2;
            System.out.println(angka1 + " x " + angka2 + " = " + hasil);       
        }else if (operator == "/"){
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        }else if (operator == "%"){
            hasil = angka1 % angka2;
            System.out.println(angka1 + " // " + angka2 + " = " + hasil);
            
    
}
}
}