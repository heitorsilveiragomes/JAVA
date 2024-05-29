package Etapa3;
import java.util.Scanner;
public class C13EX2Complemento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx = 0;
        do {
            System.out.println("Digite o valor de x (-1 para sair): ");
            x = teclado.nextDouble();
            if (x != -1) {

                System.out.println("O valor de f(x) é: " + fx);
            }
        } while (x != -1);
        teclado.close();
        System.out.println("Fim do programa");
    }
}
