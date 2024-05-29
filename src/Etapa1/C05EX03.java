package Etapa1;
import java.util.Scanner;
public class C05EX03 {
    public static void main(String[] args) {
        double salario, ndependentes, Liquido, Imposto_Renda;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor seu salário: ");
        salario = teclado.nextDouble();
        System.out.print("Digite o numero de dependentes: ");
        ndependentes = teclado.nextDouble();
        Liquido = salario - (ndependentes * 60.00);
        Imposto_Renda = Liquido * 15.00 / 100;
        System.out.println("O Imposto de Renda é:"+Imposto_Renda);
        teclado.close();


    }
}
