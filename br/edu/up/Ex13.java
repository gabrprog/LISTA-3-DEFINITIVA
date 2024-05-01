package br.edu.up;

import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int totalAptas = 0;
        int totalInaptas = 0;
        
        System.out.println("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();
        
        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.println("\nDigite os dados da pessoa " + i + ":");
            
            System.out.println("Nome: ");
            String nome = leitor.next();
            
            System.out.println("Sexo (M para masculino, F para feminino): ");
            char sexo = leitor.next().toUpperCase().charAt(0);
            
            System.out.println("Idade: ");
            int idade = leitor.nextInt();
            
            System.out.println("Saúde (A para apto, I para inapto): ");
            char saude = leitor.next().toUpperCase().charAt(0);
            
            if ((sexo == 'M' && idade >= 18 && saude == 'A') || (sexo == 'F' && idade >= 18 && idade <= 45 && saude == 'A')) {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalAptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalInaptas++;
            }
        }
        
        System.out.println("Total de pessoas aptas: " + totalAptas);
        System.out.println("Total de pessoas inaptas: " + totalInaptas);
        
        leitor.close();
    }
}
