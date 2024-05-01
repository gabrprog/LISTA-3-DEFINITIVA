package br.edu.up;

import java.util.Scanner;

public class Ex23 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.println("Digite a altura da pessoa (em metros): ");
        double altura = leitor.nextDouble();

        System.out.println("Digite a idade da pessoa: ");
        int idade = leitor.nextInt();

        double pesoIdeal = calcularPesoIdeal(sexo, altura, idade);

        if (pesoIdeal == -1) {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        leitor.close();
    }

    private static double calcularPesoIdeal(char sexo, double altura, int idade) {
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    return (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    return (72.7 * altura) - 53;
                } else {
                    return (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    return (72.7 * altura) - 50;
                } else {
                    return (72.7 * altura) - 58;
                }
            }
        } else if (sexo == 'F') {
            if (altura > 1.70) {
                if (idade <= 35) {
                    return (62.1 * altura) - 44.7;
                } else if (idade >= 36 && idade <= 39) {
                    return (62.1 * altura) - 45;
                } else {
                    return (62.1 * altura) - 49;
                }
            } else {
                if (idade <= 40) {
                    return (62.1 * altura) - 50;
                } else {
                    return (62.1 * altura) - 58;
                }
            }
        } else {
            return -1; // Retorna -1 se o sexo for inválido
        }
    }
}
