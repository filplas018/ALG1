/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Filip Plass
 */
public class Trojuhelnik {
    public static void main (String[] args){
        //in
        int ax = 0; int bx = 5; int cx = 3;
        int ay = 0; int by = 0; int cy = 5;
        
        double stranaA = lineLength(bx,cx,by,cy);
        double stranaB = lineLength(ax,cx,ay,cy);
        double stranaC = lineLength(ax,bx,ay,by);
        
        //cal
        double obsah = Obsah(stranaA,stranaB,stranaC);
        double obvod = stranaA + stranaB + stranaC;
        
        //out
        System.out.format("Delky stran: a = %.2f cm b = %.2f cm c = %.2f cm", stranaA, stranaB, stranaC);
        System.out.format("\nObvod trojuhelnika: %.2f cm", obvod);
        System.out.format("\nObsah trojuhelnika: %.2f cm^2", obsah);
        
    }
    public static double lineLength(int x1, int y1, int x2, int y2){
        return (double)Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
    }
    public static double Obsah(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }
    public static double Obvod(double a, double b, double c){
        return a+b+c;
        
    }
}
