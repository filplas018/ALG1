/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class Seconds {
    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        int hodiny = sc.nextInt();
        int minuty = sc.nextInt();
        int sekundy = sc.nextInt();
        //cal
        int sekundyCelkem = hodiny*3600 + minuty*60 + sekundy;
        //out
        System.out.println(String.format("%d", sekundyCelkem));
        
    }
}
