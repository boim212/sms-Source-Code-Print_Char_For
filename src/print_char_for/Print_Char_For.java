/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print_char_for;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Print_Char_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int counter, angka;
        char huruf1, huruf2;
        String nama;
        
        System.out.print  ("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Counter = ");
        angka = input.nextInt();
        
        for (counter = 0, huruf1 = 'a', huruf2 = 'A'; counter < angka; huruf1++,huruf2++, counter++) {
            System.out.printf ("%c. %s      %c. %s %n" , huruf1, nama, huruf2, nama);
        }
    }
}
