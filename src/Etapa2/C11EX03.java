import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C11EX03 {

    public static void main(String[] args) {
        // Declara��o das vari�veis
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

                // Verifica se � uma multa de pontua��o 8 na primeira quinzena do m�s
                if (dia <= 15 && pontos == 8) {
                    multasPontos8++;
                }

                // Incrementa o total arrecadado
                totalArrecadado += valorMulta;
            }

            // Imprime a quantidade de multas de pontua��o 8 na primeira quinzena
            System.out.println("Quantidade de multas de pontua��o 8 na primeira quinzena: " + multasPontos8);

            // Imprime o valor total arrecadado com as multas
            System.out.println("Valor total arrecadado com as multas: R$ " + totalArrecadado);

            // Fecha o scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo n�o encontrado.");
        }
    }

    // M�todo para calcular o valor da multa de acordo com a pontua��o
    public static double calcularValorMulta(int pontos, double[] valores) {
        switch (pontos) {
            case 3:
                return valores[0];
            case 5:
                return valores[1];
            case 8:
                return valores[2];
            default:
                return 0.0; // Retornar 0 se a pontua��o n�o estiver na tabela
        }
    }
}

