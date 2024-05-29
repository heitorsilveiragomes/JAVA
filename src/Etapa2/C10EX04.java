package Etapa2;

import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custoParcial, taxaBDI = 0,custoTotal = 0,quantidade = 0,precoUnitario = 0;
        String nomeMaterial ;

        // Ler a taxa de BDI
        System.out.print("Informe a taxa de BDI (%): ");
        taxaBDI = teclado.nextDouble();

        // Loop para ler os materiais
        do {
            teclado.nextLine();
            System.out.print("Informe o nome do material (ou FIM para terminar): ");
            nomeMaterial = teclado.nextLine();

            // Verifica se é o fim da entrada
            if (nomeMaterial.equalsIgnoreCase("FIM")) {
                break;
            }



            System.out.print("Informe a quantidade do material: ");
            quantidade = teclado.nextDouble();

            System.out.print("Informe o preço unitário do material: ");
            precoUnitario = teclado.nextDouble();

            // Calcula o custo parcial e acumula no custo total
            custoParcial = quantidade * precoUnitario;
            custoTotal += custoParcial;

            System.out.printf("Custo parcial do material %s: R$ %.2f\n"
                    , nomeMaterial, custoParcial);
        } while (true);

        // Calcula o BDI e o preço final
        double valorBDI = custoTotal * taxaBDI / 100;
        double precoFinal = custoTotal + valorBDI;

        System.out.printf("Custo Total: R$ %.2f\n", custoTotal);
        System.out.printf("Valor BDI: R$ %.2f\n", valorBDI);
        System.out.printf("Preço Final do Produto: R$ %.2f\n", precoFinal);

        teclado.close();
    }
}