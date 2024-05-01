package br.edu.up;

import java.util.Scanner;

public class Ex08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        String mencao;
        if (media >= 7.0) {
            mencao = "Aprovado";
        } else if (media <= 5.0) {
            mencao = "Reprovado";
        } else {
            mencao = "Recuperação";
        }
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Menção: " + mencao);
        
        leitor.close();
    }
}
