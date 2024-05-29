package Etapa2;

import java.util.Scanner;

import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaMultas = 0;
        int quantidadeValores = 0;
        double valor;

        do {
            System.out.print("Digite o valor financeiro (-1 para sair): ");
            valor = scanner.nextDouble();

            if (valor != -1) {
                double multa = valor * 0.1; // 10% do valor
                System.out.println("Multa: " + multa);
                somaMultas += multa;
                quantidadeValores++;
            }
        } while (valor != -1);

        double mediaMultas = somaMultas / quantidadeValores;
        System.out.println("Média das multas: " + mediaMultas);

        scanner.close();
    }
}

