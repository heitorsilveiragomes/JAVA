import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDias = 121;
        double[] temperaturas = new double[totalDias];
        double totalTemperatura = 0;

        for (int aux = 0; aux < totalDias; aux++) {
            System.out.println("Digite a temperatura do dia " + (aux + 1) + ":");
            temperaturas[aux] = scanner.nextDouble();
            totalTemperatura += temperaturas[aux];
        }

        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        int diasMaiorTemperatura = 0;

        for (int aux = 0; aux < totalDias; aux++) {
            if (temperaturas[aux] < menorTemperatura) {
                menorTemperatura = temperaturas[aux];
            }
            if (temperaturas[aux] > maiorTemperatura) {
                maiorTemperatura = temperaturas[aux];
            }
        }

        for (int aux = 0; aux < totalDias; aux++) {
            if (temperaturas[aux] == maiorTemperatura) {
                diasMaiorTemperatura++;
            }
        }

        double mediaTemperatura = totalTemperatura / totalDias;

        System.out.println("Menor temperatura registrada: " + menorTemperatura);
        System.out.println("Maior temperatura registrada: " + maiorTemperatura);
        System.out.println("Média das temperaturas registradas: " + mediaTemperatura);
        System.out.println("Quantidade de dias que ocorreu a maior temperatura: " + diasMaiorTemperatura);

        scanner.close();
    }
}
