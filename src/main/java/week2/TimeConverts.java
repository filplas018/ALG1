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
public class TimeConverts {
    public static void main(String[] args){
        //in
        Scanner sc = new Scanner(System.in);
        var timeInput = sc.nextDouble();
        
        var time = ToTime(timeInput);
        var hours = ToHours(time);
        System.out.println("Hours: " + hours);
        System.out.println("\nČasový údaj celý: ");
        System.out.println(time[0]);
        System.out.println(time[1]);
        System.out.println(time[2]);
    }
    //cal
        private static double ToHours(double[] time){
            return time[0] + (time[1]/60) + time[2]/3600;
    }
        private static double[] ToTime(double hours){
            var celkem = hours*3600;
            
            
            double hodiny = celkem/3600;
            celkem -= hodiny*3600;
            
            double minutes = celkem/60;
            celkem -= minutes*60;
          
            return new double[]{hodiny, minutes, celkem};
    }
}
