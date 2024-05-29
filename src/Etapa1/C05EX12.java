package Etapa1;

import java.util.Scanner;

public class C05EX12 {
    public static void main(String[] args) {
        int tempoevento, minutos, horas, segundos;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tempo do evento em segundos: ");
        tempoevento = teclado.nextInt();

         horas = tempoevento / 3600;
         minutos = (tempoevento % 3600) / 60;
         segundos = tempoevento % 60;

        System.out.println("O tempo do evento é: "+tempoevento+ " segundos"+" -->"+" "+horas+" Horas"+","+minutos+" Minutos"+" e "+segundos+" Segundos.");

        //Segundos = 10000  Hor = 2, Min = 46, Seg = 40
        //Segundos = 365     Hor = 0, Min = 6,   Seg = 5


        teclado.close();



    }
}
