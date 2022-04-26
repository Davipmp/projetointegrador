/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula1.adofor;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class AdoFor {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            for(int i = 1; i<=100; i++){
            
                if (i % 2 == 0){
                    System.out.println("Numero positivo " + i);
                }
            }
            
            
    }
}
