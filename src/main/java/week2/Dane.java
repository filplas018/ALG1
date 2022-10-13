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
public class Dane {
    public static final double SOCIALNI = 6.5;
    public static final double ZDRAVOTNI = 4.5;
    public static final double DAN_Z_HRUBE_MZDY = 15;
    
    
    public static final double ODVOD_SOCIALNI = 24.8;
    public static final double ODVOD_ZDRAVOTNI = 9;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double odpracovaneHodiny = sc.nextDouble();
        double hodinovaSazba = sc.nextDouble();
        
        double hrubaMzda = odpracovaneHodiny * hodinovaSazba;
        
        double cistaMzda = 
    }
}
