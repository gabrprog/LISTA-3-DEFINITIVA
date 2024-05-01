package br.edu.up;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite a distância total percorrida (em km): ");
            double distanciaTotal = leitor.nextDouble();

            System.out.println("Digite o total de combustível gasto (em litros): ");
            double combustivelGasto = leitor.nextDouble();

            double consumoMedio = calcularConsumoMedio(distanciaTotal, combustivelGasto);

            System.out.printf("O consumo médio do automóvel é de %.2f km/l.\n", consumoMedio);
        } catch (Exception e) {
            System.out.println("Por favor, insira valores numéricos válidos.");
        } finally {
            leitor.close();
        }
    }

    public static double calcularConsumoMedio(double distanciaTotal, double combustivelGasto) {
        return distanciaTotal / combustivelGasto;
    }
}
