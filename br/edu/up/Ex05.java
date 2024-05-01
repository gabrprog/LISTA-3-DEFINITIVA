package br.edu.up;

import java.util.Scanner;

public class Ex05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o valor da compra: R$ ");
            double valorCompra = leitor.nextDouble();

            double valorPrestacao = valorCompra / 5;

            System.out.println("O valor de cada prestação é: R$ " + valorPrestacao);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar um valor válido.");
        } finally {
            leitor.close();
        }
    }
}
