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
public class HoursMinutesSeconds {
    public static void main(String[] args)
    {
        //in
        Scanner sc = new Scanner(System.in);
        int sekundyCelkem = sc.nextInt();
        //cal
        int hodiny = sekundyCelkem/3600;
        sekundyCelkem -= hodiny*3600;
        
        int minuty = sekundyCelkem/60;
        sekundyCelkem -= minuty*60;
        
        int sekundy = sekundyCelkem;        
        
        String clock = String.format(
                (hodiny > 9?"%d:":"0%d:") + (minuty > 9?"%d:":"0%d:") + (sekundy > 9?"%d":"0%d"),
                hodiny, minuty, sekundy);
        System.out.println(clock);
    }
}
