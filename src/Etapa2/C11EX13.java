import java.util.Scanner;

public class C11EX13 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Informe o n�mero de termos da s�rie: ");
        int n = scanner.nextInt();
        scanner.close();

        double S = 71.0; // Inicializa a soma da s�rie
        int contador = 1;

        do {
            double numerador = contador * Math.pow(9 * contador + 1, 2 * contador);
            double denominador = Math.pow(7, contador);
            S += numerador / denominador;
            contador++;
        } while (contador <= n);

        System.out.println("Valor da S�rie = " + S);
    }
}
