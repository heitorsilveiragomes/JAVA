package Etapa1;

import java.util.Scanner;

public class C06EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, valorfixo=0, percentual=0, bruto, imp_renda, liquido;

        System.out.print("Digite o salário do empregado: ");
        salario = teclado.nextDouble();

        if (salario <= 300){
            valorfixo = 500;
            percentual = salario * 70 / 100;
        } else if (salario <= 1000) {
            valorfixo = 200;
            percentual = salario * 50 / 100;
        }else {
            valorfixo = 0;
            percentual = salario * 30 /100;
        }

        bruto = valorfixo + percentual;
        imp_renda = bruto * 25 / 100;
        liquido = bruto - imp_renda;


        System.out.println("O valor do PL Líquido é: R$" + liquido );
        teclado.close();
    }
}
