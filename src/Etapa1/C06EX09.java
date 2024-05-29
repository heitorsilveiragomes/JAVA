package Etapa1;

import java.util.Scanner;

public class C06EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, pesoideal= 0 ;
        String sexo;

        System.out.print("Digite (F) para Mulher e (M) para Homem: ");
        sexo = teclado.nextLine();

        System.out.print("Digite a sua altura: ");
        altura = teclado.nextDouble();


        if (sexo.equalsIgnoreCase("M") ) {
            pesoideal = 72.7 * altura -58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoideal = 62.1 * altura - 44.7;
        }
        System.out.print("Sexo = "+ sexo+ "-->"+ pesoideal);
        teclado.close();

    }
}
