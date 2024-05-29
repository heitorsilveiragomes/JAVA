// Yan Carlos Duarte Velasco

package Etapa1;

import java.util.Scanner;

public class C06Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de faltas: ");
        int faltas = scanner.nextInt();

        System.out.print("Digite as notas das três provas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho final: ");
        double notaTrabalho = scanner.nextDouble();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        double notaFinal = (nota1 + nota2 + nota3 + notaTrabalho) / 4;

        int peso1;
        if (faltas <= 5) {
            peso1 = 3;
        } else if (faltas <= 10) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        int peso2;
        if (idade <= 17) {
            peso2 = 3;
        } else if (idade <= 50) {
            peso2 = 2;
        } else {
            peso2 = 1;
        }

        double resultadoFinal = notaFinal * (peso1 + peso2);

        String classificacao;
        if (resultadoFinal <= 50) {
            classificacao = "Reprovado";
        } else if (resultadoFinal <= 70) {
            classificacao = "Regular";
        } else if (resultadoFinal <= 80) {
            classificacao = "Bom";
        } else if (resultadoFinal <= 90) {
            classificacao = "Muito Bom";
        } else {
            classificacao = "Excelente";
        }

        System.out.println("Resultado = " + classificacao);
    }
}
