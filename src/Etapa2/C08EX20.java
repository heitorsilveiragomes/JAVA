    package Etapa2;

    import java.util.Scanner;

    public class C08EX20 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int n;
           double termo = 1; // termo inicial
            double soma = 0; // variável para guardar as somas
            System.out.println("Digite o número de termos da progressão: ");
            n = teclado.nextInt();

            System.out.println("Os " + n + " primeiros termos da progressão são:");
            for (int aux = 1; aux <= n; aux++) {
                System.out.println(termo);
                soma += termo;
                termo *= 2; // cada termo é o dobro do anterior
            }

            System.out.printf("A soma dos termos é: %1.0f ", soma);
        }
    }

