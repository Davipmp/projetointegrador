/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula1.listadeexercicios;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class ListadeExercicios {

    public static void main(String[] args) {
        System.out.println("Numeros consecutivos");
        Scanner input = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite o numero: ");
        a = input.nextInt();
        System.out.println("Digite o numero: ");
        b = input.nextInt();
        
        a = a+1;
        b = b+1;
        
        System.out.println(" O numero de consecutivo sera: " + a++);
        System.out.println(" O numero consecutivo sera: " + b++);
        
        
    }
}
