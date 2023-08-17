package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta Russa
 * Data: 17/08/2023
 * Autora: Giovana Manuquian
 * */

public class Roleta {
    public static void main(String[] args) {

        /**Declarar Variaveis*/

        int userNumber,numberRandom;
        String nome;
        boolean continuar = true;

        /**Instanciar Scanner*/

        Scanner teclado = new Scanner(System.in);

        /**Instanciar Random*/

        Random random = new Random();

        while (continuar) {

            /**Coletar Dados*/

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("Seja bem vindo(a)");
            System.out.print("Digite seu nome: ");
            nome = teclado.next();
            System.out.print("Olá" + nome + "Digite seu número da sorte [1-10]: ");
            userNumber = teclado.nextInt();
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

            /**Lógica do Jogo*/

            numberRandom = random.nextInt(10) + 1;

            if (userNumber == numberRandom) {
                continuar = false;
                System.out.println("Você perdeu!");
            } else {
                System.out.println("Parabéns! Você ganhou!");
            }
        }

    }

}
