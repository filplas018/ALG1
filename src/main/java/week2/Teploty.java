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
public class Teploty {
    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        double rano = sc.nextDouble();
        double poledne = sc.nextDouble();
        double vecer = sc.nextDouble();
        System.out.println(PrumeraDenniTeplota(rano, poledne, vecer));
        
    }
    //cal
    private static double PrumeraDenniTeplota(double rano, double poledne, double vecer){
        return (rano + 2*poledne + vecer)/4;
    }
    
    
}
