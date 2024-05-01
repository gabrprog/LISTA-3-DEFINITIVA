package br.edu.up;

import java.util.Scanner;

public class Ex25 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do estudante: ");
        String nomeEstudante = leitor.nextLine();
        
        System.out.println("Digite o número de matrícula do estudante: ");
        String numeroMatricula = leitor.nextLine();
        
        System.out.println("Digite as notas do estudante:");
        System.out.println("Nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Nota da avaliação semestral (0 a 10): ");
        double notaSemestral = leitor.nextDouble();

        System.out.println("Nota do exame final (0 a 10): ");
        double notaExameFinal = leitor.nextDouble();
        
        if (!verificarIntervaloDeNotas(notaLaboratorio, notaSemestral, notaExameFinal)) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            return;
        }
        
        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);
        
        String classificacao = obterClassificacao(notaFinal);
        
        System.out.println("Nome do estudante: " + nomeEstudante);
        System.out.println("Número de matrícula: " + numeroMatricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
        
        leitor.close();
    }

    private static boolean verificarIntervaloDeNotas(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        return notaLaboratorio >= 0 && notaLaboratorio <= 10 &&
               notaSemestral >= 0 && notaSemestral <= 10 &&
               notaExameFinal >= 0 && notaExameFinal <= 10;
    }

    private static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }
    
    private static String obterClassificacao(double notaFinal) {
        if (notaFinal >= 8) {
            return "A";
        } else if (notaFinal >= 7) {
            return "B";
        } else if (notaFinal >= 6) {
            return "C";
        } else if (notaFinal >= 5) {
            return "D";
        } else {
            return "R";
        }
    }
}
