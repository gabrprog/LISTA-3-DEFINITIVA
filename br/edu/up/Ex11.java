package br.edu.up;

import java.util.Scanner;

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int totalHomens = 0;
        int totalMulheres = 0;
        
        for (int i = 1; i <= 56; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = leitor.nextLine();
            
            System.out.println("Digite o sexo da pessoa " + i + " (M para masculino, F para feminino): ");
            char sexo = leitor.nextLine().toUpperCase().charAt(0);
            
            if (sexo == 'M') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido.");
                i--;
            }
        }
        
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        
        leitor.close();
    }
}
