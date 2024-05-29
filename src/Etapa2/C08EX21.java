package Etapa2;
import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        double imc;
        String situacao;

        System.out.println("\n| Peso (kg) |    IMC    | Situação corpórea |");
        for (int peso = 60; peso <= 100; peso++) {
             imc = peso / (altura * altura);
             situacao = "";
            if (imc < 20) {
                situacao = "Abaixo do peso";
            } else if (imc >= 20 && imc <= 25) {
                situacao = "Peso ideal";
            } else {
                situacao = "Acima do peso";
            }
            System.out.printf("|    %d     |  %.2f  |      %s      |\n", peso, imc, situacao);
        }

        scanner.close();
    }
}
