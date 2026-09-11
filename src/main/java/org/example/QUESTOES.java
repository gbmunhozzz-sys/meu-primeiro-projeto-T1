package org.example;

import java.util.Scanner;

class QUESTOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor investido: R$ ");
        double valorInvestido = scanner.nextDouble();

        if (valorInvestido <= 10000) {
            System.out.println("Categoria: Bronze");
        } else if (valorInvestido <= 50000) {
            System.out.println("Categoria: Prata");
        } else if (valorInvestido <= 100000) {
            System.out.println("Categoria: Ouro");
        } else {
            System.out.println("Categoria: Platinum");
        }

        scanner.close();
    }
}