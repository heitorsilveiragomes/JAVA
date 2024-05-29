package Etapa1;
import java.util.Scanner;

public class C05EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double S, angulo, R;
        System.out.print("Digite o valor da área de um setor circular: ");
        S = teclado.nextDouble();
        System.out.print("Digite o valor do ângulo : ");
        angulo = teclado.nextDouble();

        R = Math.sqrt((360 * S) / (angulo * 3.1416));

        System.out.println("O valor do Raio é " +R);
        teclado.close();


    }
}
