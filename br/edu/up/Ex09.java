package br.edu.up;

import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        int contador = 0;
        
        for (int i = 1; i <= 80; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = leitor.nextInt();
            
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + contador);
        
        leitor.close();
    }
}
