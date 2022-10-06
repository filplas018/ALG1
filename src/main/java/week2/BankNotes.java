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
public class BankNotes {
 public static void main(String[] args) {
        //vstup pevně zadaný v programu
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        //tyto proměnné poslouží k výstupu
        int b100, b50, b20, b10, b5, b2, b1;
        
        b100 = amount / 100;
        amount -= 100 * b100;
        b50 = amount / 50;
        amount -= 50 * b50;
        b20 = amount / 20;
        amount -= 20 * b20;
        b10 = amount / 10;
        amount -= 10 * b10;
        b5 = amount / 5;
        amount -= 5 * b5;
        b2 = amount / 2;
        amount -= 2 * b2;
        b1 = amount / 1;
        amount -= b1;
        
        //vypsané výstupy
        System.out.println(
                b100 + " stokorun\n" +
                b50 + " padesátikorun\n" +
                b20 + " dvacetikorun\n" +
                b10 + " desetikorun\n" +
                b5 + " pětikorun\n" +
                b2 + " dvoukorun\n" +
                b1 + " korun\n"
        );
    }   
}
