package Etapa2;

import java.util.Scanner;
public class C10EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int populacaototal, diascontaminacao = 0, anos,meses,dias;
        double taxacontaminacao,populacaocontaminada = 1;

        do {
        System.out.print("Informe a taxa de contaminação diária: ");
        taxacontaminacao = teclado.nextDouble();
        if (taxacontaminacao < 0 || taxacontaminacao > 1) {
            System.out.println("A taxa de contaminação deve ser um valor entre 0 e 1.");
        }
        } while (taxacontaminacao < 0 || taxacontaminacao > 1);
        System.out.print("Informe a população total da região: ");
        populacaototal = teclado.nextInt();

        while (populacaocontaminada < populacaototal) {
            populacaocontaminada += populacaocontaminada * taxacontaminacao;
            diascontaminacao++;
        }

        anos = diascontaminacao / 365;                  // (365 dias = 1 ano)
        meses = (diascontaminacao % 365) / 30;          // (Ano / quantidade de dias por mês)
        dias = (diascontaminacao % 365) % 30;           // (Mes / quantidade de dias por mês)

        System.out.println("População = "+ populacaototal+" --> Serão necessários " + anos + " anos, " + meses + " meses e " + dias + " dias para população total ser contaminada.");

        teclado.close();
    }
}
