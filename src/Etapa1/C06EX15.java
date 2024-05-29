package Etapa1;

import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigopacote,dias;
        double extras, valorfixo, diaria, imposto, total,totalimposto, conta;
        String cidades;

        System.out.print("Digite o código do seu pacote: ");
        codigopacote = teclado.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        dias = teclado.nextInt();

        System.out.print("Digite o valor dos serviços extras: ");
        extras = teclado.nextDouble();

        teclado.nextLine();
        System.out.print("Digite o nome da cidade: ");
        cidades = teclado.nextLine();

        switch (codigopacote){
            case 1:
                valorfixo = 65.00;
                diaria = 1.20;
                break;
            case 2:
                valorfixo = 104.00;
                diaria = 2.10;
                break;
            case 3:
                valorfixo = 137.00;
                diaria = 0.00;
                break;
            default:
                System.out.println("Pacote inválido: ");
                return;
        }

        imposto = switch (cidades){
            case "belo horizonte" -> 0.00;
            case "são paulo" -> 0.01;
            case "rio de janeiro" -> 0.015;
            default -> 0.02;
        };

        total = diaria * dias;
        if (codigopacote == 1 && total > 65) {
            total = 65.00;
        }


        totalimposto = (valorfixo + total + extras) * imposto;
        conta = valorfixo + total * extras + totalimposto;



        System.out.printf("Conta = R$ %1.2f",conta);







        //Conta = Valor Fixo + Diárias Canais PPP + Serviços Extras + Imposto (sobre Fixo/PPP/Extras)

    }
}
