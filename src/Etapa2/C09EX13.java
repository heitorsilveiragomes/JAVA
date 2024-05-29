package Etapa2;
import java.util.Scanner;

public class C09EX13 {
    public static void main(String[] args) {
        int termos;
        double num, den, serie = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe quantidade de termos: ");
        termos = teclado.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            num = 1;
            for (int n = 1; n <= aux; n++) {
                num *= n;
            }
            den = Math.pow(2, aux) - 1;
            if (aux % 2 == 0) {
                serie -= (num / den);
            } else {
                serie += (num / den);
            }
        }
        System.out.println("Valor da Série = " + serie);
        teclado.close();
    }
}
