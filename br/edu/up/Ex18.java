package br.edu.up;

import java.util.Scanner;

public class Ex18 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a idade do funcionário: ");
        int idade = leitor.nextInt();
        
        System.out.println("Digite o sexo do funcionário (M/F): ");
        char sexo = leitor.next().charAt(0);
        
        System.out.println("Digite o salário fixo do funcionário: ");
        double salarioFixo = leitor.nextDouble();
        
        double abono;
        
        if (sexo == 'M') {
            abono = (idade >= 30) ? 100.00 : 50.00;
        } else if (sexo == 'F') {
            abono = (idade >= 30) ? 200.00 : 80.00;
        } else {
            System.out.println("Sexo inválido.");
            leitor.close();
            return;
        }
        
        double salarioLiquido = salarioFixo + abono;
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);
        
        leitor.close();
    }
}
