package Etapa1;

import javax.swing.*;
import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imposto, multa = 0;
        int dias;

        System.out.println("Digite o valor do Imposto: ");
        imposto = teclado.nextDouble();

        System.out.println("Digite a quantidade de Dias: ");
        dias = teclado.nextInt();



        switch (dias){
            case 1,2,3,4,5 -> System.out.println("Multa = ISENTA" );
            case 6,7,8 -> System.out.println("Multa = R$"+ imposto * dias * 0.02);
            case 9,10 -> System.out.println("Multa = R$"+ (multa = imposto * 0.1 + (0.5 * dias)));
            default -> System.out.println("Multa = R$"+ (multa = imposto * 1.5 + (1 * dias)));
        }

        teclado.close();
    }
}
