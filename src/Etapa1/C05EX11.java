package Etapa1;

import java.util.Scanner;

public class C05EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int chequebank, codigobank, codigoagen, sequencianum;
        System.out.print("Informe o número de seu cheque bancário ( 9 dígitos): ");
        chequebank = teclado.nextInt();

        codigobank = chequebank / 1000000;
        codigoagen = chequebank / 1000 % 1000;
        sequencianum = chequebank % 1000;

        System.out.println("Seu código bancário é: "+codigobank+"\n"+"Seu código de agência é: "+codigoagen+"\n"+"Sua sequência numérica é: "+sequencianum);
        teclado.close();

    }
}
