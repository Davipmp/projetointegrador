/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author davi_
 */
public class olegadodorei2 {

    static int ataqueJogador() {

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha seu ataque sobre o computador: ");
        System.out.println("[1] - Soco");
        System.out.println("[2] - Poder Especial");
        return input.nextInt();

    }

    static int ataqueComputador() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1; // Retorna numeros entre 1 e 3; 
    }

    static void imprimirHP(int hpJogador, int hpComputador, int contagemEspeciais) {
        System.out.println(" ******* BATALHA ****** ");
        System.out.println(" - HP do Jogador: " + hpJogador);
        System.out.println(" - HP computador: " + hpComputador);
        System.out.println(" - Poder especial " + contagemEspeciais);
        System.out.println(" ******* BATALHA ******");

    }

    static int luta() {
        int hpJogador = 100;
        int hpPc = 0;
        int contagemEspeciais = 5;
        int decidirAtaque;
        int i = 1;

        while (hpJogador > 0) {
            hpPc = 10 + i;

            System.out.println(" >>> INIMIGO MONSTRO <<< " + i);
            System.out.println(" -=-=-=-=-=-=-=-=- \n");

            while (hpJogador > 0 && hpPc > 0) {
                imprimirHP(hpJogador, hpPc, contagemEspeciais);
                decidirAtaque = ataqueJogador();
                switch (decidirAtaque) {
                    case 1:
                        System.out.println(" Soco selecionado. ");
                        hpPc -= 4;
                        break;
                    case 2:
                        if (contagemEspeciais <= 0) {
                            System.out.println("Você não tem mais especiais.");
                        } else {
                            System.out.println(" Especial selecionado. ");
                            hpPc -= 20;
                            contagemEspeciais--;
                            break;
                        }
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
                if (hpPc > 0) {
                    decidirAtaque = ataqueComputador();
                    switch (decidirAtaque) {
                        case 1:
                            System.out.println("Pc atacou com um soco seu jogador");
                            hpJogador -= 2 + (int) (i / 10);
                            break;
                        case 2:
                            System.out.println("Pc atacou com um chute seu jogador");
                            hpJogador -= 3 + (int) (i / 10);
                            break;
                        case 3:
                            System.out.println("Pc atacou com um poder especial");
                            hpJogador -= 4 + (int) (i / 20);
                            break;
                    }

                } else {
                    System.out.println(" Monstro derrotado!\n  ");
                }
            }
            if (hpJogador > 0) {
                hpJogador += 6;
                if (hpJogador > 100) {
                    hpJogador = 100;
                }
                if (i % 6 == 0) {
                    contagemEspeciais++;
                    if (contagemEspeciais > 5) {
                        contagemEspeciais = 5;
                    }
                }
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

        Scanner dev = new Scanner(System.in);
        int op1;
        do {
            //menu 
            System.out.println("");
            System.out.println("Escolha as opções a baixo. ");
            System.out.println("1 - Iniciar o jogo!");
            System.out.println("2 - Créditos ");
            System.out.println("3 - sair do jogo");
            System.out.println("Opcao escolhida: ");
            op1 = dev.nextInt();
        } while (op1 > 3 || op1 < 1);
        switch (op1) {
            case 1:
                System.out.println("O jogo irá se iniciar ... \n ");
                System.out.println(" ==--==-- O LEGADO DO REI ==--==-- \n");
                System.out.println(" Insira as informações abaixo para seguir o jogo ");

                System.out.println("Digite o nome do seu jogador: ");
                String primeiroNome = dev.next();
                System.out.println("Digite seu ultimo nome: ");
                String ultimoNome = dev.next();

                System.out.println(" O nome do seu usuário é: \n" + primeiroNome + " " + ultimoNome + " \n");

                System.out.println("     **** Seja bem vindo ao jogo **** \n" + primeiroNome + " " + ultimoNome + " !!! \n");

                System.out.println(" A história é iniciada nos anos 500 D.C, Gustford é um \n guerreiro que em sua trajetória é em busca de "
                        + "tesouros perdidos, com isso seu filho Dave é treinado desde pequeno \n para seguir as tradições de seu pai."
                        + "Ao passar um período Dave se torna um guerreiro, e começa busca de \n tesouros junto ao seu pai, porém em uma "
                        + "aventura em busca de tesouros, seu pai é morto e Dave acaba sendo \n encontrado em um bar na cidade "
                        + "na Noruega, chamada Kattegat, com isso ele acorda sem entender nada, e \n descobre que seu pai morreu. Sendo assim,"
                        + "ele irá seguir pela cidade em buscas de tesouro em honra a seu pai. \n "
                        + " No cenário atual, você esta dentro de um bar, e nota um baú, neste baú tem atribuições de ataque.   ");

                int op;
                int hpJogador = 100;

                System.out.println(" >>> Combo para ataques dentro do baú <<< \n ");
                System.out.println("Você deseja aprimorar esses ataques ? [1] - Sim [2] - Não");
                op = dev.nextInt();
                if (op == 1) {
                    System.out.println("Você atribuiu condições de ataque, possuindo também HP = " + hpJogador);

                } else if (op == 2) {
                    System.out.println(" É preciso atribuir os poderes de ataque, para seguir adiante sua aventura. ");
                    System.out.println("Aprimore agora seus ataque. Digite [1] ");
                    op = dev.nextInt();
                    if (op == 1) {
                        System.out.println("Parabéns, atribuição adquira! ");
                    }
                }
                System.out.println(" Apos ter atribuido seu ataque, ande até o lado Sul do mapa já preparado"
                        + " para enfrentar as batalhas do jogo. ");
                System.out.println("Você deseja sair do bar e seguir a aventura atrás dos tesouros, pelo lado"
                        + "sul da cidade ? [1] Sim [2] Não");
                op = dev.nextInt();
                if (op == 1) {
                    System.out.println("Você esta pela cidade a caminho do lado sul, porém no caminho "
                            + "foi encontrado um monstro que irá desejar sua morte. ");

                    System.out.println(" Dave, seu jogador está de frente a um monstro que é seu adversário, "
                            + "é preciso vencer para poder seguir seu \n caminho e adquirir recordes e batalhas ao seu jogador. ");
                } else if (op == 2) {
                    System.out.println(" É necessário enfrentar o seu adversário para seguir o jogo. [1] para continuar. ");
                    op = dev.nextInt();
                }
                int resposta = 1;
                int recordedeTesouros = 0;
                while (resposta == 1) {
                    int pontos = luta();
                    System.out.println("o Jogador chegou a  " + pontos + " pontos. ");
                    if (pontos > recordedeTesouros) {
                        recordedeTesouros = pontos;
                    }
                    System.out.println(" Recorde de tesouros atual = " + recordedeTesouros);

                    System.out.println("Fim do jogo. Deseja continuar ? [1] Sim [2] Nao");
                    resposta = dev.nextInt();
                }
                if (resposta == 2) {
                    System.out.println("Você chegou ao fim do jogo, Parabéns! Seus tesouros adquiridos foram"
                            + " " + recordedeTesouros);
                }
                return;
            case 2:
                System.out.println("Desenvolvedores <DAVI> , <GUSTAVO> e <LEVY> ! \n ");
                return;
            case 3:
                System.out.println("Saiu do jogo \n ");
                break;
        }
    }
}
