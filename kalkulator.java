package kalkulator;

import kedua.karnivora;
import java.util.Scanner;

public class kalkulator {
    private static String Ulangi;

    // main method
    public static void main(String[] args){
        OperasiDasar();
    }

    // method operasi
    public static void OperasiDasar(){
        System.out.println("APLIKASI KALKULATOR");
        System.out.println("-------------------");

        // create algorithm
        // input value
        System.out.println("pilihan : ");
        System.out.println("1. Tambah, 2. Kurang, 3. Kali, 4. Bagi");
        Scanner pilihan = new Scanner(System.in);
        int choose = pilihan.nextInt();
        System.out.println("=============");
        if (choose == 1){
            operasi.tambah();
        } else if (choose == 2 ){
            operasi.kurang();
        } else if (choose == 3){
            operasi.kali();
        } else {
            operasi.bagi();
        }

        System.out.println("Ulangi (1) atau keluar (2)? ");
        Scanner ngulang = new Scanner(System.in);
        Ulangi = ngulang.nextLine();
        if (Ulangi.equalsIgnoreCase("Y")){
            OperasiDasar();
        }
    }
}