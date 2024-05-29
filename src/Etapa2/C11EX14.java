import java.util.Scanner;


// Calcula o valor de PI atrav�s da s�rie 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
public class C11EX14 {
    public static void main(String[] args) {
        double pi = 0;
        double term;
        int i = 0;
        int sign = 1;  // Alternar� entre 1 e -1

        // Loop at� que o valor de pi esteja dentro do intervalo desejado
        do {
            // Calcula o termo atual da s�rie
            term = 4.0 * sign / (2 * i + 1);
            pi += term;

            // Atualiza o sinal para a pr�xima itera��o
            sign = -sign;

            // Incrementa o contador de termos
            i++;
        } while (!(pi > 3.1416 && pi < 3.1417));

        // Corrige o �ltimo termo somado
        pi -= term;

        // Imprime os resultados
        System.out.println("Valor de PI = " + pi);
        System.out.println("Termos = " + (i-1)); // Subtrai 1 porque o �ltimo termo excedeu o limite
    }
}
