import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C11EX03 {

    public static void main(String[] args) {
        // Declaração das variáveis
        int dia;
        String placa;
        int pontos;
        int multasPontos8 = 0;
        double totalArrecadado = 0.0;

        // Tabela de valores das multas
        double[] valores = {42.0, 108.0, 479.0};

        try {
            // Carregar o arquivo de entrada
            File file = new File("multas.txt");
            Scanner scanner = new Scanner(file);

            // Ler as multas do arquivo
            while (true) {
                // Ler dia, placa e pontos
                dia = scanner.nextInt();
                if (dia == 99) // Verifica a flag de encerramento
                    break;
                placa = scanner.next();
                pontos = scanner.nextInt();

                // Calcula o valor da multa
                double valorMulta = calcularValorMulta(pontos, valores);

                // Imprime a placa e o valor da multa
                System.out.println("Placa: " + placa + ", Valor da multa: R$ " + valorMulta);

                // Verifica se é uma multa de pontuação 8 na primeira quinzena do mês
                if (dia <= 15 && pontos == 8) {
                    multasPontos8++;
                }

                // Incrementa o total arrecadado
                totalArrecadado += valorMulta;
            }

            // Imprime a quantidade de multas de pontuação 8 na primeira quinzena
            System.out.println("Quantidade de multas de pontuação 8 na primeira quinzena: " + multasPontos8);

            // Imprime o valor total arrecadado com as multas
            System.out.println("Valor total arrecadado com as multas: R$ " + totalArrecadado);

            // Fecha o scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }

    // Método para calcular o valor da multa de acordo com a pontuação
    public static double calcularValorMulta(int pontos, double[] valores) {
        switch (pontos) {
            case 3:
                return valores[0];
            case 5:
                return valores[1];
            case 8:
                return valores[2];
            default:
                return 0.0; // Retornar 0 se a pontuação não estiver na tabela
        }
    }
}

