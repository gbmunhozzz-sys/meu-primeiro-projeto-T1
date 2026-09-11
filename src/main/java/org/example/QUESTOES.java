import java.util.Scanner;

class QUESTOES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do cliente: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor da parcela desejada: ");
        double parcela = scanner.nextDouble();

        double limiteParcela = salario * 0.30;

        if (parcela <= limiteParcela) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo recusado.");
        }

        scanner.close();
    }
}