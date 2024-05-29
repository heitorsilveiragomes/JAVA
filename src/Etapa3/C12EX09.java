package Etapa3;

import java.util.Scanner;

public class C12EX09 {
        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            int num[] = new int[10];
            int somanum = 0;

            for (int aux=0; aux<num.length; aux++) {
                System.out.print("Informe 10 valores numéricos: ");
                num[aux] = teclado.nextInt();
                somanum += num[aux];
            }

            for (int aux=0; aux<num.length; aux++) {
               if (somanum % num[aux] == 0) {
                   System.out.println(num[aux]+ " é divisor da soma dos números informados");
                }
               
            }
        }
    }
