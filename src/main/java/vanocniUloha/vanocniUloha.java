/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanocniUloha;

/**
 *
 * @author Filip Plass
 */
public class vanocniUloha {
    public static void main(String[] args)
    {
        Snezi();
    }
    
    public static void Snezi()
    {
        int row = 10;
        int col = 40;
        Terminal terminal = TerminalBuilder.terminal();
        terminal.puts(InfoCmp.Capability.cursor_address, row, col);
        System.out.println("Here we start at row " + row + " col " + col);
        System.out.println("Now you see the cursor");

        Thread.sleep(2000);
        terminal.puts(InfoCmp.Capability.cursor_invisible);
        System.out.println("Now you don't!");

        Thread.sleep(2000);
        terminal.puts(InfoCmp.Capability.cursor_visible);
        System.out.println("And the cursor is back again.");
    }
}
