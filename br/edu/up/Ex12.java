package br.edu.up;

import java.util.Scanner;

public class Ex12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        
        while (true) {
            System.out.println("Digite o ano do veículo: ");
            int ano = leitor.nextInt();
            
            double desconto;
            if (ano <= 2000) {
                desconto = 0.12; 
                totalCarrosAte2000++;
            } else {
                desconto = 0.07; 
            }
            
            System.out.println("Digite o valor do veículo: ");
            double valorVeiculo = leitor.nextDouble();
            
            double valorDesconto = valorVeiculo * desconto;
            double valorFinal = valorVeiculo - valorDesconto;
            
            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);
            
            totalGeral++;
            
            System.out.println("Deseja continuar calculando desconto?: ");
            String continuar = leitor.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break; 
            }
        }
        
        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
        
        leitor.close();
    }
}
