package Etapa1;

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precocaixa, valoraluguel, custoembalagem, custoestocagem, custototal;
        int quantidadeproduzida, quantidadedefeitos, mesesatecopa, quantidadecaixas, quantidadegalpoes;

        System.out.print("Digite a quantidade de bolas produzidas: ");
        quantidadeproduzida = teclado.nextInt();

        System.out.print("Digite a quantidade de bolas com defeito: ");
        quantidadedefeitos = teclado.nextInt();

        System.out.print("Digite o preço unitário das caixas de papelão: ");
        precocaixa = teclado.nextDouble();

        System.out.print("Digite a quantidade de meses até a Copa: ");
        mesesatecopa = teclado.nextInt();

        System.out.print("Digite o valor mensal do aluguel do galpão: ");
        valoraluguel = teclado.nextDouble();

        quantidadecaixas = (quantidadeproduzida - quantidadedefeitos) / 10;
        if ((quantidadeproduzida - quantidadedefeitos) % 10 != 0) {
            quantidadecaixas++;
        }

        quantidadegalpoes = quantidadecaixas / 850;
        if (quantidadecaixas % 850 != 0) {
            quantidadegalpoes++;
        }

        custoembalagem = quantidadecaixas * precocaixa;
        custoestocagem = quantidadegalpoes * valoraluguel * mesesatecopa;
        custototal = custoembalagem + custoestocagem;

        System.out.println("Custo total de embalagem: R$" + custoembalagem);
        System.out.println("Custo total de estocagem: R$" + custoestocagem);
        System.out.println("Custo total: R$" + custototal);

        teclado.close();
    }
}