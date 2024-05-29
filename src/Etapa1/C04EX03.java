package Etapa1;
import java.util.Scanner;

public class C04EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double xxx1, xxx2, xxx3, xxx4, xxx5;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a Quantidade de Poluente Emitido; ");
        xxx1 = teclado.nextDouble();
        System.out.println("Informe a Quantidade Limite de Poluente Emitido : ");
        xxx2 = teclado.nextDouble();
        System.out.println("Informe o Valor da Multa 1: ");
        xxx3 = teclado.nextDouble();
        System.out.println("Informe o Valor da Multa 2: ");
        xxx4 = sc.nextDouble();
        System.out.println("Informe o Valor da Multa por Poluente Emitido: ");
        xxx5 = sc.nextDouble();

        System.out.print("==============================================================="+"\n");
        System.out.print("Quantidade de Poluente Emitido x Valor da Multa\n");
        System.out.print("---------------------------------------------------------------"+"\n");
        System.out.print("Até "+ xxx1 +" multa de R$ "+ xxx3 +" \n");
        System.out.print("---------------------------------------------------------------"+"\n");
        System.out.print("Entre "+ xxx1 +" e "+ xxx2 +" multa de R$ "+ xxx4 +" \n");
        System.out.print("---------------------------------------------------------------"+"\n");
        System.out.print("Acima de "+ xxx2 +" multa de R$ "+ xxx5 +" por poluente emitido\n");
        System.out.print("===============================================================");
        teclado.close();


    }
}
