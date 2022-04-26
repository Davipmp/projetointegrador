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
public class exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        
        //System.out.println("Digite o valor1: ");
        //v1 = input.nextInt();
        //System.out.println("Digite o valor2: ");
        //v2 = input.nextInt();
        //System.out.println("Digite o valor3: ");
        //v3 = input.nextInt();
        //System.out.println("Digite o valor4: ");
        //v4 = input.nextInt();
        //System.out.println("Digite o valor5: ");
        //v5 = input.nextInt();
        //System.out.println("Digite o valor6: ");
        //v6 = input.nextInt();
        
        //total = (v1+v2+v3+v4+v5+v6);
        //System.out.println("Total dos valores sao: " + total);
       int num, media = 0, somaPares = 0;  
       for(int i = 1; i<6; i++){
           System.out.println("Digite o valor:");
           num = input.nextInt();
           
           
           if(num % 2 ==0){
               somaPares = somaPares + num; 
               System.out.println(" O numero e par! ");
               media = somaPares/2;
           }
           
       }
       System.out.println(" a soma dos numeros pares foi: " + somaPares); 
        System.out.println(" A media dos numeros inseridos e: " + media); 
   }
 }
    

