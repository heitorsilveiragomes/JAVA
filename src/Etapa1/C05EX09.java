package Etapa1;
import java.util.Scanner;

public class C05EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, Media;
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = teclado.nextDouble();

        nota1 = nota1 * 2;
        nota2 = nota2 * 3;
        nota3 = nota3 * 5;
        Media = (nota1 + nota2 + nota3)/10;


        System.out.println("O valor da Média Ponderada do aluno é: " +Media);
        teclado.close();
    }
}
