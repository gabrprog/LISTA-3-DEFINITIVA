package br.edu.up;

import java.util.Scanner;

public class Ex01 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.println("Digite a nota da primeira prova: ");
            double nota1 = leitor.nextDouble();

            System.out.println("Digite a nota da segunda prova: ");
            double nota2 = leitor.nextDouble();

            System.out.println("Digite a nota da terceira prova: ");
            double nota3 = leitor.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar valores válidos.");
        } finally {
            leitor.close();
        }
    }
}
