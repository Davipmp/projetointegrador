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
public class exercicio1 {
            public static void main(String [] args){
                
                Scanner input = new Scanner(System.in);
                
                float n1, n2, total;
                
                System.out.println("Multiplicacao de dois numeros!");
                
                System.out.println("Digite um numero: ");
                n1 = input.nextFloat();
                System.out.println("Digite o segundo numero: ");
                n2 = input.nextFloat();
                
                total = n1*n2;
                
                System.out.println(" total " + total);
                
                
                
            }
}
