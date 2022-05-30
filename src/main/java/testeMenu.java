/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;   


/**
 *
 * @author davi_
 */
public class testeMenu {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        
        System.out.println("--- ESCOLHA SEU PERSONAGEM ---");
        System.out.println("--- PERSONAGEM - 1 - PALADINO ");
        System.out.println("--- PERSONAGEM - 2 - GUERREIRO ");
        System.out.println("--- PERSONAGEM - 3 - MAGO ");
        System.out.println("--- PERSONAGEM - 4 - FEITICEIRO \n");
        System.out.println(" Escolha seu personagem para iniciar: ");
        
        
    }
        public static void paladino(){
            System.out.println("Metodo utilizado > Paladino < ");
        }
        public static void guerreiro(){
            System.out.println("Método utilizado > guerreiro < ");
        }
        public static void mago(){
            System.out.println("Método utilizado > Mago < ");
        }
        public static void feiticeiro(){
            System.out.println("Método utilizado > Feiticeiro < ");
        }
    public static void main(String[] args) {
        int op; 
        Scanner input = new Scanner(System.in);
        op = input.nextInt();
        
        
        menu();
        switch (op){
            case 1: 
                paladino();
                break;
            case 2: 
                guerreiro();
                break;
            case 3:
                mago();
                break;
            case 4: 
                feiticeiro();
                break;
            default:
                System.out.println("Opção selecionada incorreta!");
        } 
    }
}
