package br.edu.up;

import java.util.Scanner;

public class Ex07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o custo de fábrica do carro: ");
            double custoFabrica = leitor.nextDouble();

            double porcentagemDistribuidor = 0.28;
            double porcentagemImpostos = 0.45;

            double custoConsumidor = custoFabrica + (custoFabrica * porcentagemImpostos) + (custoFabrica * porcentagemDistribuidor);

            System.out.println("O custo ao consumidor do carro é: " + custoConsumidor);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        } finally {
            leitor.close();
        }
    }
}
