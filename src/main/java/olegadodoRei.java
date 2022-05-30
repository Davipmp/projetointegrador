/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/**
 *
 * @author davi_
 */
public class olegadodoRei {

    /**
     * @param args the command line arguments
     */
           public static void main(String[] args) {
           // decisao de saber se da para voltar para casa
           // usando trem da linha 9
           // problema: nem sempre o trem esta funcionando
           
           try (Scanner entrada = new Scanner(System.in)){
               System.out.println("Digite a data de nascimento no formato aaaa-MM-dd");
               String dataNascimentoStr = entrada.nextLine();
               
               LocalDate daNascimento = LocalDate.parse(dataNascimentoStr);
               
               long idade1 = ChronoUnit.YEARS.between(daNascimento, LocalDate.now());
               System.out.println("Idade: " + idade1);
           } catch (Exception ex) {
               System.out.println("ERRO: DATA DE NASCIMENTO INVÁLIDA");
               ex.printStackTrace();
           } finally {
               System.out.println("==== programa finalizado");
           }
    }
    
}
