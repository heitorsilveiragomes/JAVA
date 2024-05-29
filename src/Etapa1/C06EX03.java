package Etapa1;

import java.util.Scanner;


public class C06EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Double venda, salario, comissao = 0.0;
        System.out.print("Informe a quantidade de vendas feita no mês: ");
        venda = teclado.nextDouble();
        //salario = 240 + comissao;

        if (venda <= 1000)
            comissao = 0.0;
        else {
            if (venda <= 10000){
                comissao = venda * 10 / 100;
            }
            else if (venda > 10000) {
                comissao = 1000.0;
            }

        }
        salario = 240 + comissao;
        System.out.println("A comissão a ser recebida é de : R$: "+ salario);

        teclado.close();



    }
}
