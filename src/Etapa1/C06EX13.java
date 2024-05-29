package Etapa1;

import java.util.Scanner;

public class C06EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int horainicial= 0, minutoinicial= 0, horafim= 0, minutofim=0, tempohoras, tempominutos;


        System.out.print("Digite a hora inicial do jogo: ");
         horainicial = teclado.nextInt();

        System.out.print("Digite o minuto inicial do jogo: ");
        minutoinicial = teclado.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        horafim = teclado.nextInt();

        System.out.print("Digite o minuto final do jogo: ");
        minutofim = teclado.nextInt();

        if (horafim > horainicial || (horafim == horainicial && minutofim >= minutoinicial)) {
            tempohoras = horafim - horainicial;
            tempominutos = minutofim - minutoinicial;
        } else {
            tempohoras = 24 - horainicial + horafim;
            tempominutos = minutofim - minutoinicial;
        }

        if (tempominutos < 0) {
            tempohoras--;
            tempominutos += 60;
        }
    System.out.println("Duração = " + tempohoras + " horas e " + tempominutos + " minutos.");

        teclado.close();
    }
    }

