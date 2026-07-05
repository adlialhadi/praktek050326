/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktek050326;

/**
 *
 * @author adli al hadi
 */
import java.util.Scanner;
public class Max2 {
    public static void main(String[]args){
        int a,b,max;
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Menentukan Bilangan Terbesar === ");
        System.out.print("Bialngan 1 =");
        a =in.nextInt();
        System.out.print("Bialngan 2 =");
        b = in.nextInt();
        if(a>b)
            max = a;
        else //a<b
            max = b;
        // endif
       System.out.println(max + " merupakan bilangan terbesar");
    }
}
