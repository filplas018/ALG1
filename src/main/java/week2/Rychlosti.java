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
public class Rychlosti {
    public static void main(String[] args){
        //in
        Scanner sc = new Scanner(System.in);
        double delkaUseku = sc.nextDouble();
        int povolenaRychlost = sc.nextInt();
        int[] cas = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt()};
        //cal
        int celkovyCas = cas[0] + cas[1]/60 + cas[2]/3600 + cas[3]/360000;
        double prumernaRychlost = delkaUseku/celkovyCas;
        double prekroceni = prumernaRychlost - povolenaRychlost;
        System.out.println(String.format("Prumerna dosazena rychlost: %f km/h", prumernaRychlost));
        System.out.println(prekroceni <= 0?"\nNebyla překročena povolená rychlost."
                :"Povolená rychlost překročena o: " + prekroceni + " km/h."
                        + "\n Vaše pokuta činí: " + pokuta(prekroceni));
        
    }
    public static int toSeconds(int[] cas){
        return cas[0] + cas[1]/60 + cas[2]/3600 + cas[3]/360000;
    }
    public static double pokuta(double prekroceni){
        
        if(prekroceni <= 19 && prekroceni >= 1){
            return getRandomNumber(1500,2500);
        }
        else if(prekroceni <= 39 && prekroceni >= 20){
            return getRandomNumber(2500, 5000);
        }
        else{
            return getRandomNumber(5000,10000);
        }
    }
    public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
}
}
