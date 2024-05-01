package br.edu.up;

import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do vendedor: ");
            String nomeVendedor = leitor.nextLine();

            System.out.println("Digite o salário fixo do vendedor: ");
            double salarioFixo = leitor.nextDouble();

            System.out.println("Digite o total de vendas efetuadas no mês: ");
            double totalVendas = leitor.nextDouble();

            double comissao = totalVendas * 0.15;
            double salarioFinal = salarioFixo + comissao;

            System.out.println("Nome do vendedor: " + nomeVendedor);
            System.out.println("Salário fixo: R$ " + salarioFixo);
            System.out.println("Salário no final do mês: R$ " + salarioFinal);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        } finally {
            leitor.close();
        }
    }
}
