package br.edu.up;

import java.util.Scanner;

public class Ex20 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número de horas/aula trabalhadas: ");
        int horasAula = leitor.nextInt();
        
        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        int nivelProfessor = leitor.nextInt();
        
        double valorHoraAula = obterValorHoraAula(nivelProfessor);
        
        if (valorHoraAula == -1) {
            System.out.println("Nível de professor inválido.");
            return;
        }
        
        double salario = horasAula * valorHoraAula;
        
        System.out.println("O salário do professor é: R$" + salario);
        
        leitor.close();
    }
    
    private static double obterValorHoraAula(int nivelProfessor) {
        switch (nivelProfessor) {
            case 1:
                return 12.00;
            case 2:
                return 17.00;
            case 3:
                return 25.00;
            default:
                return -1;
        }
    }
}
