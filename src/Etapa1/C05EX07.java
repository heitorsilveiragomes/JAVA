package Etapa1;
import java.util.Scanner;

public class C05EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;
        System.out.print("Digite o valor de x : ");
        x = teclado.nextDouble();

        fx = Math.sqrt(Math.pow((x/4+1),2)+x/5);

        System.out.println("O valor da função é " +fx);
        teclado.close();

    }
}
