package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
     double kilo,index,boy;
     
        Scanner input= new Scanner(System.in);
        System.out.println(" boy girin:");
         boy=input.nextDouble();
         
         System.out.println("kilo girin:");
        kilo=input.nextDouble();
        
       index=kilo/(boy*boy);
        System.out.println("indeksiniz:"+index);
        
    }
    
}
