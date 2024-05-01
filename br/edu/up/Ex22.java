package br.edu.up;

import java.util.Scanner;

public class Ex22 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoCliente = scanner.nextInt();

        double valorKwh = obterValorKwh(tipoCliente);
        if (valorKwh == -1) {
            System.out.println("Tipo de cliente inválido.");
            return;
        }

        System.out.println("Digite o consumo em kWh: ");
        double consumo = scanner.nextDouble();

        double valorConta = calcularValorConta(consumo, valorKwh);

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        scanner.close();
    }

    private static double obterValorKwh(int tipoCliente) {
        switch (tipoCliente) {
            case 1:
                return 0.60;
            case 2:
                return 0.48;
            case 3:
                return 1.29;
            default:
                return -1; // Retorna -1 se o tipo de cliente for inválido
        }
    }

    private static double calcularValorConta(double consumo, double valorKwh) {
        return consumo * valorKwh;
    }
}
