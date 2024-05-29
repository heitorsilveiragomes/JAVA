package Etapa2;

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, somaalturahomens = 0;
        String sexo;
        int quantidademulheres = 0, mulherespesomenor60 = 0, quantidadehomens = 0, quantidadepessoas = 0;

        // Loop para ler os dados das pessoas
        while (true) {
            System.out.print("Informe o seu sexo (F/M) ou FIM para terminar: ");
            sexo = teclado.nextLine();

            // Verifica se é o fim da entrada
            if (sexo.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.print("Informe o seu peso: ");
            peso = teclado.nextDouble();

            System.out.print("Informe a sua altura: ");
            altura = teclado.nextDouble();
            teclado.nextLine(); // Limpa o buffer do teclado após ler um número

            if (sexo.equalsIgnoreCase("F")) {
                quantidademulheres++;
                if (peso < 60) {
                    mulherespesomenor60++;
                }
            } else if (sexo.equalsIgnoreCase("M")) {
                somaalturahomens += altura;
                quantidadehomens++;
            }

            quantidadepessoas++; // Incrementa a contagem total de pessoas pesquisadas
        }

        // Calcula a média da altura dos homens
        double mediaalturahomens = quantidadehomens > 0 ? somaalturahomens / quantidadehomens : 0;

        System.out.println("Quantidade de pessoas pesquisadas: " + quantidadepessoas);
        System.out.println("Quantidade de mulheres: " + quantidademulheres);
        System.out.println("Altura média dos homens: " + mediaalturahomens);
        System.out.println("Quantidade de mulheres com peso menor que 60: " + mulherespesomenor60);

        teclado.close();
    }
}