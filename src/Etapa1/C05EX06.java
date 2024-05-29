package Etapa1;
import java.util.Scanner;
public class C05EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B, C, x, y, Distancia;
        System.out.print("Digite o valor de A : ");
        A = teclado.nextDouble();
        System.out.print("Digite o valor de B : ");
        B = teclado.nextDouble();
        System.out.print("Digite o valor de C : ");
        C = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada x do Ponto P: ");
        x = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y do Ponto P : ");
        y = teclado.nextDouble();



        Distancia = (A * x + B * y + C) / Math.sqrt(Math.pow(A,2) + Math.pow(B,2));

        System.out.println("A Distância presente é " +Distancia);
        teclado.close();
    }
}
