package br.edu.up;

import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite a cotação do dólar (R$): ");
            double cotacaoDolar = leitor.nextDouble();

            System.out.println("Digite a quantidade de dólares disponíveis: ");
            double quantidadeDolares = leitor.nextDouble();

            double valorEmReais = quantidadeDolares * cotacaoDolar;

            System.out.println("Valor em reais (R$): " + valorEmReais);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        } finally {
            leitor.close();
        }
    }
}
