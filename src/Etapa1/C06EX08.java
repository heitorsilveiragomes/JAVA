package Etapa1;

import java.util.Scanner;

public class C06EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double altura, minimo, maximo;

        System.out.print("Digite o nome da pessoa: ");
        nome = teclado.nextLine();

        System.out.print("Digite a altura da pessoa (em metros): ");
        altura = teclado.nextDouble();

        double IMC = 20 * Math.pow(altura, 2);
        minimo = 20 * Math.pow(altura, 2);
        maximo = 25 * Math.pow(altura, 2);

        if (IMC < 20){
            System.out.println("Pessoa está abaixo do peso.");
            System.out.println("Peso mínimo: " + minimo + " kg");
            System.out.println("Peso máximo: " + maximo + " kg");
        } else if (IMC >= 25) {
            System.out.println("Pessoa está acima do peso.");
            System.out.println("Peso mínimo: " + minimo + " kg");
            System.out.println("Peso máximo: " + maximo + " kg");
        } else  {
            System.out.println("Pessoa está no peso ideal.");
        }

        teclado.close();
    }
}