package Etapa2;
import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorR, mediaValores, valoresAcima = 0, quantidadeValores = 0, valorT = 0;

        do {
            System.out.println("Digite os valores recebidos  (0 para sair): ");
            valorR = scanner.nextDouble();
            if (valorR != 0) {
                valorT += valorR;
                quantidadeValores++;

                if (valorR > 1000) {
                    valoresAcima++;
                }
            }
        } while (valorR != 0);

        mediaValores = valorT / quantidadeValores;
        System.out.println("O valor total recebido é de: " + valorT);
        System.out.println("Média dos valores recebidos  : " + mediaValores);
        System.out.println("Quantidade de valores acima de R$1000.00 : " + valoresAcima);

        scanner.close();
    }
}