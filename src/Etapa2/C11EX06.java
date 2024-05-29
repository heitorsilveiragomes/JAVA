

import java.util.Scanner;

public class C11EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] canais = {4, 7, 12};
        int[] audiencia = new int[3];
        int totalCasas = 78;
        int totalPessoas = 0;

        for (int i = 0; i < totalCasas; i++) {
            System.out.println("Número do canal:");
            int canal = scanner.nextInt();
            System.out.println("Número de pessoas assistindo:");
            int pessoas = scanner.nextInt();

            for (int j = 0; j < canais.length; j++) {
                if (canal == canais[j]) {
                    audiencia[j] += pessoas;
                    totalPessoas += pessoas;
                }
            }
        }

        int canalMaisAssistido = canais[0];
        int maiorAudiencia = audiencia[0];

        for (int i = 0; i < canais.length; i++) {
            double percentual = (double) audiencia[i] / totalPessoas * 100;
            System.out.println("Audiência do canal " + canais[i] + ": " + audiencia[i]);
            System.out.println("Porcentagem de audiência do canal " + canais[i] + ": " + percentual + "%");

            if (audiencia[i] > maiorAudiencia) {
                maiorAudiencia = audiencia[i];
                canalMaisAssistido = canais[i];
            }
        }

        double mediaPessoas = (double) totalPessoas / totalCasas;

        System.out.println("Canal mais assistido: " + canalMaisAssistido);
        System.out.println("Média de pessoas assistindo TV: " + mediaPessoas);

        scanner.close();
    }
}