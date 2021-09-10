/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UKL7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //latihan soal 3
        String Kendaraan= " ";
        int id_masuk;
        int id_keluar;
        int harga=0;
        int gol=0;
        
        System.out.println("Daftar Kota : ");
        System.out.println("1. Waru ");
        System.out.println("2. Porong ");
        System.out.println("3. Sidoarjo \n");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input Golongan : "); gol = input.nextInt();
        
        System.out.print("Input Masuk : ") ; 
        id_masuk = input.nextInt();
        System.out.print("Input Keluar : ") ; 
        id_keluar = input.nextInt();
        
       
            if (gol == 1) {
                
                Kendaraan="Sedan, Jip, Pick up";
            }else if (gol == 2) {
                Kendaraan = "Truk dengan 2 Sumbu roda";
            }else if (gol == 3) {
                Kendaraan = "Truk dengan 3 Sumbu roda";
            }
            

            if (id_masuk == 1) {
                if (id_keluar == 1) {
                    switch(gol){
                        case 1:
                            harga=6000;
                            System.out.println("Masuk Waru - Keluar Sidoarjo");
                            break;
                        case 2:
                            harga=9000;
                            System.out.println("Masuk Waru - Keluar Sidoarjo");
                            break;
                        case 3:
                            harga=9000;
                            System.out.println("Masuk Waru - Keluar Sidoarjo");
                            break;
                    }
                }else if (id_keluar == 2) {
                    switch(gol){
                        case 1:
                            harga=9000;
                            System.out.println("Masuk Waru - Keluar Porong");
                            break;
                        case 2:
                            harga=14000;
                            System.out.println("Masuk Waru - Keluar Porong");
                            break;
                        case 3:
                            harga=14000;
                            System.out.println("Masuk Waru - Keluar Porong");
                            break;
                    }
                }
            }else if(id_masuk == 3){
                if (id_keluar == 1) {
                    switch(gol){
                        case 1:
                            harga=6000;
                            System.out.println("Masuk Sidoarjo - Keluar Waru");
                            break;
                        case 2:
                            harga=9000;
                            System.out.println("Masuk Sidoarjo - Keluar Waru");
                            break;
                        case 3:
                            harga=9000;
                            System.out.println("Masuk Sidoarjo - Keluar Waru");
                            break;
                    }
                }else if (id_keluar == 2) {
                    switch(gol){
                        case 1:
                            harga=5500;
                            System.out.println("Masuk Sidoarjo - Keluar Porong");
                            break;
                        case 2:
                            harga=8500;
                            System.out.println("Masuk Sidoarjo - Keluar Porong");
                            break;
                        case 3:
                            harga=8500;
                            System.out.println("Masuk Sidoarjo - Keluar Porong");
                            break;
                    }
                }
            }else if (id_masuk == 2) {
                if(id_keluar == 3){
                    switch(gol){
                        case 1:
                            harga=5500;
                            System.out.println("Masuk Porong - Keluar Sidoarjo");
                            break;
                        case 2:
                            harga=8500;
                            System.out.println("Masuk Porong - Keluar Sidoarjo");
                            break;
                        case 3:
                            harga=8500;
                            System.out.println("Masuk Porong - Keluar Sidoarjo");
                            break;
                    }
                }else if (id_keluar == 1) {
                    switch(gol){
                        case 1:
                            harga=9000;
                            System.out.println("Masuk Porong - Keluar Waru");
                            break;
                        case 2:
                            harga=14000;
                            System.out.println("Masuk Porong - Keluar Waru");
                            break;
                        case 3:
                            harga=14000;
                            System.out.println("Masuk Porong - Keluar Waru");
                            break;
                    }
                }
            }
        
        System.out.println("Harga "+harga);
        System.out.println("Dengan kendaraan "+Kendaraan+" Golongan = "+gol);
    }
}
   
    
    

