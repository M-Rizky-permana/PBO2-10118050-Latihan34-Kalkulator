/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas34;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator();
        Scanner s = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka Ke-1 = ");
        k.value1=s.nextDouble();
        System.out.print("Masukkan Angka Ke-2 = ");
        k.value2=s.nextDouble();
       
        
        System.out.println();
        System.out.println("Hasil Pertambahan = "+k.tambahBilangan());
        System.out.println("Hasil Pengurangan = "+k.kurangBilangan());
        System.out.println("Hasil Pengurangan = "+k.kaliBilangan());
        System.out.println("Hasil Pengurangan = "+k.bagiBilangan());
        System.out.println("Hasil Pengurangan = "+k.sisaBilangan());
        
    }
    
}
