package Etapa1;
import java.util.Scanner;

public class C05EX04 {
    public static void main(String[] args) {

        double  x, y, x2, y2, Distancia;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a coordenada x do Ponto 1 : ");
        x = teclado.nextDouble();
        System.out.print("Digite a coordenada y do Ponto 1: ");
        y = teclado.nextDouble();
        System.out.print("Digite a coordenada x do Ponto 2 : ");
        x2 = teclado.nextDouble();
        System.out.print("Digite a coordenada y do Ponto 2: ");
        y2 = teclado.nextDouble();

        Distancia = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y2),2));
        System.out.println("A Distância do Ponto é:"+Distancia);
        teclado.close();

    }
}
