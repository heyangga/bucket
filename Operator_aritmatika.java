package Perkenalan;

public class Operator_aritmatika {

    public static void main(String[] args) {
        
        int Kurang = 50-100;
        int a = 16;
        int b = 2;
        int c = 7;
        int Kali = a*c;
        
        System.out.println("+ : Penjumlahan");
        System.out.println("- : Pengurangan");
        System.out.println("* : Perkalian");
        System.out.println("/ : Pembagian");
        System.out.println("% : Modulus(sisa bagi)\n");
        
        System.out.println("2 + 7 = "+(b+c)); // penjumlahan
        System.out.println("50 - 100 = "+Kurang); // pengurangan
        System.out.println("16 x 7 = "+Kali); // perkalian
        System.out.println("16 : 2 = "+(a/b)); // pembagian
        System.out.println("16 mod 7 = "+(a%c)); // modulus
    }
    
}
