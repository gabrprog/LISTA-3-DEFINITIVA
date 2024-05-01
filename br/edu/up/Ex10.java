package br.edu.up;

import java.util.Scanner;

public class Ex10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();
        
        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = leitor.nextInt();
            
            if (idade >= 18) {
                System.out.println("Pessoa " + i + " é maior de idade.");
            } else {
                System.out.println("Pessoa " + i + " é menor de idade.");
            }
        }
        
        leitor.close();
    }
}
