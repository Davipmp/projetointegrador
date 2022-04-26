/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.adofor;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorN; 
        System.out.println(" --- TABUADA --- ");
        System.out.println("Digite o valor: ");
        valorN = input.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(valorN + " x " + i + " = " + (i*valorN));
        }
        
        
    }
    
}
