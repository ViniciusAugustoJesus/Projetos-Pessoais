package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes calculadora = new Operacoes();

        System.out.println("Digite a operação");
        String operacao = scanner.nextLine();

        System.out.println("Digite o primeiro numero");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        double num2 = scanner.nextDouble();

        calculadora.calcular(operacao, num1, num2);
    }
}
