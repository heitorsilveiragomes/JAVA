package Etapa1;

import java.util.Scanner;

public class C06EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Altura, peso= 0, IMC;

        System.out.print(" Informe a sua altura: ");
        Altura = teclado.nextDouble();

        System.out.print(" Informe o peso da pessoa em (Kg): ");
        peso = teclado.nextDouble();

        IMC = peso / Math.pow(Altura,2);

        if (IMC <= 18) {
            System.out.println( " A pessoa está desnutrido(a).");
        } else if (IMC < 20) {
            System.out.println( " A pessoa está abaixo do peso.");
        } else if (IMC < 25) {
            System.out.println( " A pessoa está no peso ideal.");
        } else if (IMC < 27) {
            System.out.println( " A pessoa está acima do peso.");
        } else {
            System.out.println( " A pessoa está obeso(a).");
        }
        teclado.close();




    }
}
