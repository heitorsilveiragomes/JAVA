package Etapa2;

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angulo, raio, area;

        System.out.print("Digite o valor do ângulo em graus: ");
        angulo = scanner.nextDouble();

        do {
            System.out.print("Digite o valor do raio (ou -1 para sair): ");
            raio = scanner.nextDouble();

            if (raio != -1) {
                area = (angulo * Math.PI * raio * raio) / 360;
                System.out.println("A área do setor circular é: " + area);
            }
        } while (raio != -1);

        scanner.close();
    }
}