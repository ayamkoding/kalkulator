package kalkulator;

import java.util.Scanner;

public class operasi {
    public static void tambah(){
        System.out.println("Program Penjumlahan..");
        System.out.print("Masukan Angka-1: ");
        Scanner angka1 = new Scanner(System.in);
        int AngkaPertama =  angka1.nextInt();
        System.out.print("Masukan Angka-2: ");
        Scanner angka2 = new Scanner(System.in);
        int AngkaKedua = angka2.nextInt();
        int AngkaKetiga = AngkaKedua + AngkaPertama;
        System.out.println("Hasile: " + AngkaKetiga);
    }

    public  static void kurang(){
        System.out.println("Program Pengurangan...");
        System.out.print("Masukan Angka-1: ");
        Scanner angka1 = new Scanner(System.in);
        int AngkaPertama =  angka1.nextInt();
        System.out.print("Masukan Angka-2: ");
        Scanner angka2 = new Scanner(System.in);
        int AngkaKedua = angka2.nextInt();
        int AngkaKetiga = AngkaKedua - AngkaPertama;
        System.out.println("Hasile: " + AngkaKetiga);
    }

    public  static void kali(){
        System.out.println("Program Perkalian");
        System.out.print("Masukan Angka-1: ");
        Scanner angka1 = new Scanner(System.in);
        int AngkaPertama =  angka1.nextInt();
        System.out.print("Masukan Angka-2: ");
        Scanner angka2 = new Scanner(System.in);
        int AngkaKedua = angka2.nextInt();
        int AngkaKetiga = AngkaKedua * AngkaPertama;
        System.out.println("Hasile: " + AngkaKetiga);
    }

    public  static void bagi(){
        System.out.println("Program Pembagian...");
        System.out.print("Masukan Angka-1: ");
        Scanner angka1 = new Scanner(System.in);
        float AngkaPertama =  angka1.nextInt();
        System.out.print("Masukan Angka-2: ");
        Scanner angka2 = new Scanner(System.in);
        float AngkaKedua = angka2.nextInt();
        float AngkaKetiga = AngkaPertama / AngkaKedua;
        System.out.println("Hasile: " + AngkaKetiga);
    }

}
