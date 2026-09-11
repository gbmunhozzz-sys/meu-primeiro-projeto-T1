package org.example;

import java.util.Scanner;

class QUESTOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a renda mensal do cliente: R$ ");
        double renda = scanner.nextDouble();

        System.out.print("Digite o score de crédito do cliente: ");
        int score = scanner.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium recusado.");
        }

        scanner.close();
    }
}