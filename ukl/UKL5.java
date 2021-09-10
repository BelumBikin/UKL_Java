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
public class UKL5 {
    //perkalian array 4 baris 2 kolom x 2 baris 4 kolom
    //nilai terserah
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int a[][]={{1,2,3,4},{4,3,2,1}};
          int b[][]={{1,3},{4,3},{7,1},{1,2}};
          int h[][]={{0,0},{0,0}};
            //System.out.println("A= "+ a);
            //System.out.println("B= "+ b);
            
            System.out.println("Hasil AxB");
            
            for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            for(int k=0;k<4;k++){
                
            h[i][j]=h[i][j]+a[i][k]*b[k][j];
            }
            }
            }
            for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print(h[i][j]+"\t");
            }
            System.out.println();
 }
}
    }
    

