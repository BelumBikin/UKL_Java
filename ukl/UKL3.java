/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author ASUS
 */
public class UKL3 {
    public static void main(String[] args) {
     int a=9;
     int b=8;
     int u=a;
     int s=a;
     
        System.out.println("Deret Matriks 4 Kolom: ");
        for(int i=0; i<4; i++){
        for(int j=0; j<4-i; j++){
            System.out.print(u+"\t"); 
          u=u+b;
          s=s+u;
        }
            System.out.println();
        }
    }
}
