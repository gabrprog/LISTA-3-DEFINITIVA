package br.edu.up;

import java.util.Scanner;

public class Ex15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        double totalDesconto = 0;
        double totalPago = 0;
        
        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel) ou 'zero' para encerrar: ");
            String combustivel = leitor.nextLine();
            
            if (combustivel.equalsIgnoreCase("zero")) {
                break;
            }
            
            System.out.println("Digite o valor do veículo: ");
            double valorVeiculo = leitor.nextDouble();
            
            double desconto;
            if (combustivel.equalsIgnoreCase("álcool")) {
                desconto = valorVeiculo * 0.25; 
            } else if (combustivel.equalsIgnoreCase("gasolina")) {
                desconto = valorVeiculo * 0.21; //
            } else if (combustivel.equalsIgnoreCase("diesel")) {
                desconto = valorVeiculo * 0.14;
            } else {
                System.out.println("Combustível inválido.");
                continue;
            }
            
            double valorFinal = valorVeiculo - desconto;
            
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);
            
            totalDesconto += desconto;
            totalPago += valorFinal;
            
        }
        
        System.out.println("Total de desconto: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);
        
        leitor.close();
    }
}
