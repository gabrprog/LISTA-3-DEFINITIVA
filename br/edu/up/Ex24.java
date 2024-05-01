package br.edu.up;

import java.util.Scanner;

public class Ex24 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as notas do estudante:");

        double notaLaboratorio = obterNota("Nota do trabalho de laboratório (0 a 10): ", leitor);
        double notaSemestral = obterNota("Nota da avaliação semestral (0 a 10): ", leitor);
        double notaExameFinal = obterNota("Nota do exame final (0 a 10): ", leitor);

        if (!verificarIntervaloDeNotas(notaLaboratorio, notaSemestral, notaExameFinal)) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            return;
        }

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        System.out.println("A nota final do estudante é: " + notaFinal);

        leitor.close();
    }

    private static double obterNota(String mensagem, Scanner leitor) {
        System.out.println(mensagem);
        return leitor.nextDouble();
    }

    private static boolean verificarIntervaloDeNotas(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        return notaLaboratorio >= 0 && notaLaboratorio <= 10 &&
               notaSemestral >= 0 && notaSemestral <= 10 &&
               notaExameFinal >= 0 && notaExameFinal <= 10;
    }

    private static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }
}
