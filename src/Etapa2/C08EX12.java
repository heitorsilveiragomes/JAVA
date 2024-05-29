
package Etapa2;

import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numDeRepeticoes = 1000, codigoProduto, produto1 = 0, produto2 = 0, produto3 = 0, produto4 = 0, produto5 = 0;
        double precoProduto, precoTotal = 0;
        String faturamentoTotal = null;

        for (int i = 1; i <= numDeRepeticoes; i++) {
            System.out.println ("Digite o código do produto: ");
            codigoProduto = scanner.nextInt ();

            switch (codigoProduto) {
                case 1 -> {
                    produto1++;
                    precoProduto = 1.565
                    ;
                }
                case 2 -> {
                    produto2++;
                    precoProduto = 1.890
                    ;
                }
                case 3 -> {
                    produto3++;
                    precoProduto = 2.150;
                }
                case 4 -> {
                    produto4++;
                    precoProduto = 2.963;
                }
                case 5 -> {
                    produto5++;
                    precoProduto = 3.750
                    ;
                }
                default -> throw new IllegalStateException ("Unexpected value: " + codigoProduto);
            }



            precoTotal += precoProduto;
        }

        double precoTotalProduto1 = produto1 * 1.565;
        double precoTotalProduto2 = produto2 * 1.890;
        double precoTotalProduto3 = produto3 * 2.150;
        double precoTotalProduto4 = produto4 * 2.963;
        double precoTotalProduto5 = produto5 * 3.750;

        faturamentoTotal = "O faturamento total é: " + precoTotal + "\n" +
                "O produto 1 foi vendido " + produto1 + " vezes e gerou um total de " + precoTotalProduto1 + "\n" +
                "O produto 2 foi vendido " + produto2 + " vezes e gerou um total de " + precoTotalProduto2 + "\n" +
                "O produto 3 foi vendido " + produto3 + " vezes e gerou um total de " + precoTotalProduto3 + "\n" +
                "O produto 4 foi vendido " + produto4 + " vezes e gerou um total de " + precoTotalProduto4 + "\n" +
                "O produto 5 foi vendido " + produto5 + " vezes e gerou um total de " + precoTotalProduto5 + "\n";

        System.out.println (faturamentoTotal);

        scanner.close ();
    }
}
