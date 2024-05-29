package Etapa2;

public class C08EX16 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int numero = 1000; numero <= 2000; numero++) {
            if (numero % 2 != 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números ímpares entre 1000 e 2000 é: " + media);
        } else {
            System.out.println("Não há números ímpares no intervalo de 1000 a 2000.");
        }
    }
}

