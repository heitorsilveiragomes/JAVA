package Etapa2;

  import java.util.Scanner;

        public class C08EX06 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int somaDivisao4 = 0;
                int qtdDivisao3 = 0;

                System.out.println("Digite 10 números inteiros:");

                for (int i = 0; i < 10; i++) {
                    int numero = scanner.nextInt();

                    if (numero % 2 == 0) {
                        System.out.println(numero + " é par.");
                    } else {
                        System.out.println(numero + " é ímpar.");
                    }

                    if (numero % 4 == 0) {
                        somaDivisao4 += numero;
                    }

                    if (numero % 3 == 0) {
                        qtdDivisao3++;
                    }
                }
                System.out.println("Soma dos números divisíveis por 4: " + somaDivisao4);
                System.out.println("Quantidade de números divisíveis por 3: " + qtdDivisao3);

                scanner.close();
            }
        }

