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
public class Circle {
    public static void main(String[] args){
        //in
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej poloměr.");
        double r = sc.nextDouble();
        double obvod = 2 * Math.PI * r;
        double obsah = Math.PI * Math.pow(r, 2);
        System.out.format("Obvod: %d\nObsah: %d", obvod, obsah);
    }
}
