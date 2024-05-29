package Etapa2;

import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, nomeprodutomaiscaro = "";
        int Quantidade;
        double CustoParcialMaior = 0, PrecoUnitario, CustoTotalProjeto=0, CustoParcial=0, MediaCustosParciais=0, projetomaiscaro = 0;


        System.out.println("Digite a quantidade de insumos: ");
        int quantidadedeinsumos = teclado.nextInt();

        for (int i = 1; i <= quantidadedeinsumos; i++) {
            teclado.nextLine();
            System.out.println("Digite o nome do Produto: ");
            nome = teclado.nextLine();
            System.out.println("Digite o valor Unitários: ");
            PrecoUnitario = teclado.nextDouble();
            System.out.println("Digite a quantidade de Produtos: ");
            Quantidade = teclado.nextInt();

            CustoParcial = Quantidade * PrecoUnitario;
            CustoTotalProjeto += CustoParcial;


            if (i==1 || CustoParcial > CustoParcialMaior){
                CustoParcialMaior = CustoParcial;
                nomeprodutomaiscaro = nome;
            }
        }

        MediaCustosParciais = CustoTotalProjeto/ quantidadedeinsumos;

        System.out.println("Custo total R$:"+ CustoTotalProjeto);
        System.out.printf("Media dos custos R$:%.2f%n", MediaCustosParciais);
        System.out.println("Nome do Insumo de maior custo parcial: " + nomeprodutomaiscaro);
        teclado.close();
    }
}
