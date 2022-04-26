/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.listadeexercicios;
import  java.util.Scanner;



/**
 *
 * @author Lenovo
 */
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--Calculo de um quadrado!--");
        Scanner input = new Scanner(System.in);
        
        float x, y;
        y = 2;
        
        System.out.println("Digite o lado do quadrado: ");
        x = input.nextFloat();
        
        double resultado = (Math.pow(x, y));
        
        System.out.println("o valor da area do quadrado e: " + resultado);
        
    }
    
}
