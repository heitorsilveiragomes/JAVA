package Etapa1;
import java.util.Scanner;

public class C05EX10 {
    public static void main(String[] args) {
        int numero, d1, d2, d3, d4, d5;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe número de até 5 dígitos: ");
        numero = teclado.nextInt();
        d1 = numero / 10000;
        d2 = numero / 1000 % 10;
        d3 = numero / 100 % 10;
        d4 = numero / 10 % 10;
        d5 = numero % 10;

        System.out.println(d1+"\n"+d2+"\n"+d3+"\n"+d4+"\n"+d5);
        teclado.close();

    }
}