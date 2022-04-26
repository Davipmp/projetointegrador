/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.listadeexercicios;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Leia os tres numeros decimais: A, B e C. Em seguida, calcule e mostre:");
        int A, B, C, resultado; 
        System.out.println("A) A area do triangulo retangulo que tem A por base e C por altura. ");
        System.out.println(" Digite o valor da base: ");
        C = input.nextInt();
        System.out.println(" Digite o valor da altura: ");
        A = input.nextInt();
        
        resultado = (C*A);
         
        System.out.println("A)  valor da area do triangulo retangulo e:  \n" + resultado );
        
         
        double pi, valordec, resultado1;
        pi = 3.14;
        
        System.out.println("B) Digite o valor da area do circulo de raio C: ");
        valordec = input.nextDouble();
        
        resultado1 = (valordec*pi);
        
        System.out.println(" B)  o valor de circulo de raio e: " + resultado1);
        
        int a, b, c, area; 
        
        System.out.println("\n C) A area do trapezio que tem A e B por bases e C por altura. \n ");
        System.out.println("\n Digite o valor de base A:  ");
        a = input.nextInt();
        System.out.println(" Digite o valor de base B: ");
        b = input.nextInt(); 
        System.out.println(" Digite o valor de altura C: ");
        c = input.nextInt();
        
        area = ((a+b)*c)/2;
        
        System.out.println(" O resultado da area do trapezio e: " + area);
        
        int b1;
        
        System.out.println(" D) a area do quadrado que tem um lado B. ");
        System.out.println(" \n Digite o valor de um lado do quadrado B: ");
        b1 = input.nextInt();
        
        b1 = (b1*b1);
        
        System.out.println(" o valor do quadrado e: ");
        
        
        
        
    }   
        
        
        
    
    
}
