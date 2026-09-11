package org.example;

import java.util.Scanner;

class QUESTOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da transação: R$ ");
        double valorTransacao = scanner.nextDouble();

        if (valorTransacao > 10000) {
            System.out.println("Transação suspeita! Sinalizada para análise.");
        } else {
            System.out.println("Transação normal. Nenhuma análise necessária.");
        }

        scanner.close();
    }
}