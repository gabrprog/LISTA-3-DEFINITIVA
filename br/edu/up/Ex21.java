package br.edu.up;

import java.util.Scanner;

public class Ex21 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador: ");
        int idade = leitor.nextInt();
        
        String categoria = determinarCategoria(idade);
        
        System.out.println("Categoria do nadador: " + categoria);
        
        leitor.close();
    }
    
    private static String determinarCategoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Idade fora da faixa etária";
        }
    }
}
