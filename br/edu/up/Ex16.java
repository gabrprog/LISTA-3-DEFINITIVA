package br.edu.up;

import java.util.Scanner;

public class Ex16 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        final double SALARIO_MINIMO = 1100.0; 
        
        int numFuncionarios = 584;
        
        double custoReajuste = 0.0;
        
        for (int i = 1; i <= numFuncionarios; i++) {
          
            System.out.println("Digite o salário do funcionário " + i + " em reais: ");
            double salario = leitor.nextDouble();
            
            double reajuste;
            if (salario < 3 * SALARIO_MINIMO) {
                reajuste = salario * 0.50; 
            } else if (salario <= 10 * SALARIO_MINIMO) {
                reajuste = salario * 0.20; 
            } else if (salario <= 20 * SALARIO_MINIMO) {
                reajuste = salario * 0.15; 
            } else {
                reajuste = salario * 0.10; 
            }
            
            custoReajuste += reajuste;
            
            System.out.println("O funcionário " + i + " receberá um reajuste de R$" + reajuste);
        }
        
        System.out.println("Custo total do reajuste para todos os funcionários: R$" + custoReajuste);
        
        leitor.close();
    }
}
