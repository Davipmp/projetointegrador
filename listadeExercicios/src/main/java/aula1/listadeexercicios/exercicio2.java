/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1.listadeexercicios;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class exercicio2 {
    
            public static void main(String [] args) {
                
                Scanner input = new Scanner(System.in);
                
                double x; 
                double y;
                
                System.out.println("Leia dois numeros, sendo eles a base e o expoente!\n");
                System.out.println("Digite um numero: ");
                y = input.nextDouble();
                System.out.println("Digite o expoente: ");
                x = input.nextDouble();
                
                
                double r  = (Math.pow(y, x));
                        
                 System.out.println(" Resultado sera: " + r);
                        
                        
                
                
                
                
                
            }
}
