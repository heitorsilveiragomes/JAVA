package etapa2;

import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String nomeCidade, cidadeMenorPop ="";
            double populacaoCidade, populacaoTotal = 0, eleitores=0, numHomens, numMulheres, populacaoCidadeMenor=0;
            int quantidadeCidades = 0, cidadesMaisMulheres = 0;


            do {
                System.out.println("\nInforme o nome da cidade (Zimbabue de Minas para encerrar): ");
                nomeCidade = teclado.nextLine();
                if (nomeCidade.equalsIgnoreCase("Zimbabue de Minas1"))
                    break;

                System.out.println("Informe a população da cidade: ");
                populacaoCidade = teclado.nextDouble();
                System.out.println("Informe o número de eleitores da cidade: ");
                eleitores = teclado.nextDouble();
                System.out.println("Informe a quantidade de homens que residem na cidade: ");
                numHomens = teclado.nextDouble();
                System.out.println("Informe a quantidade de mulheres que residem na cidade: ");
                numMulheres = teclado.nextDouble();

                double somaPopulacao = numHomens + numMulheres;

                if (somaPopulacao != populacaoCidade)
                    System.out.println("A soma dos homens e mulheres é diferente da população da cidade.");

                populacaoTotal += populacaoCidade;
                quantidadeCidades++;

                if (numMulheres > numHomens)
                    cidadesMaisMulheres++;

                if (quantidadeCidades == 1 || populacaoCidade < populacaoCidadeMenor) {
                    populacaoCidadeMenor = populacaoCidade;
                    cidadeMenorPop = nomeCidade;
                }

                teclado.nextLine();
            } while (true);

            double percentualEleitores = (eleitores / populacaoTotal) * 100;
            double mediaHomens = populacaoTotal / quantidadeCidades;

            System.out.println("\nQuantidade total de cidades do estado: " + quantidadeCidades);
            System.out.println("População total do estado: " + populacaoTotal);
            System.out.println("Percentual de eleitores (em relação à população total do estado): " + percentualEleitores + "%");
            System.out.println("Quantidade de cidades cuja população tem mais mulheres: " + cidadesMaisMulheres);
            System.out.println("Média de homens (em relação a todas as cidades pesquisadas): " + mediaHomens);
            System.out.println("A cidade com a menor população do estado é: " + cidadeMenorPop);

            teclado.close(); 
        }
    }






