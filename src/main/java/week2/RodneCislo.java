/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class RodneCislo {
    
    public static void main(String[] args){
        //in
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rodné číslo.");
        String rodneCislo = sc.next();
        //cal
        int currentYear = Calendar.getInstance().get(Calendar.YEAR) % 100;
        int rok = Integer.parseInt(rodneCislo.substring(0,2));
        rok = rok > currentYear? Integer.parseInt("19" + rok):Integer.parseInt("20" + rok);
        int mesic = Integer.parseInt(rodneCislo.substring(2,4));
        int den = Integer.parseInt(rodneCislo.substring(4,6));
        
        boolean zenska = mesic > 50;
        mesic = zenska == true? mesic - 50: mesic;
        //out
        System.out.format((zenska==true)?"Tato krásná žena se narodila ":"Tento krásný muž se narodil ");
        System.out.format("%02d.%02d.%02d",den, mesic, rok);
        
                
                
    }
}

