package Etapa1;

import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int nota1, nota2, nota3, media;


        System.out.print(" Digite a nota da sua primeira prova: ");
        nota1 = teclado.nextInt();

        System.out.print(" Digite a nota da sua segunda prova: ");
        nota2 = teclado.nextInt();

        System.out.print(" Digite a nota da sua terceira prova: ");
        nota3 = teclado.nextInt();

        media = (nota1 + nota2 + nota3)/ 3;

        switch (media){
            case 1,2,3,4 -> System.out.println("Conceito E");
            case 5,6 -> System.out.println("Conceito D");
            case 7 -> System.out.println("Conceito C");
            case 8 -> System.out.println("Conceito B");
            case 9,10 -> System.out.println("Conceito A");

        }
        teclado.close();
    }
}
