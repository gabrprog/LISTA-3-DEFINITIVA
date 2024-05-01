package br.edu.up;

import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        
        for (int i = 1; i <= 40; i++) {
            System.out.println("Digite os preços do produto " + i + ":");
            
            System.out.println("Preço de custo: ");
            double precoCusto = leitor.nextDouble();
            somaPrecoCusto += precoCusto;
            
            System.out.println("Preço de venda: ");
            double precoVenda = leitor.nextDouble();
            somaPrecoVenda += precoVenda;
            
            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }
        
        double mediaPrecoCusto = somaPrecoCusto / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;
        
        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
        
        leitor.close();
    }
}
