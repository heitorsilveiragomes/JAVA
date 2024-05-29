package Etapa1;

import java.util.Scanner;

public class C06EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    double capitalAplicado, numeroDias, taxaDiaria, rendimento,impostoRenda, valorResgatado;

    System.out.print("Digite o capital aplicado: ");
    capitalAplicado = teclado.nextDouble();

    System.out.print("Digite o número de dias que ficou aplicado: ");
    numeroDias = teclado.nextDouble();

    System.out.print("Digite a taxa diária (%): ");
    taxaDiaria = teclado.nextDouble() / 100;

    rendimento = capitalAplicado * taxaDiaria * numeroDias;
    impostoRenda = rendimento * 15 / 100;
    valorResgatado = capitalAplicado + rendimento - impostoRenda - 10.0;

        //System.out.println("Rendimento: R$" + rendimento);
        //System.out.println("Imposto de Renda: R$" + impostoRenda);
        System.out.println("Valor Resgatado: R$" + valorResgatado);

        teclado.close();
    }
}
