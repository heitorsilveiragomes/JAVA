package Etapa2;

public class C08EX19 {
    public static void main(String[] args) {
        int numero=0;
        double soma=0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(numero);
            soma += numero;
            numero = (int) Math.pow(i + 1, 2);
        }
        System.out.println("Soma dos 100 primeiro números: "+soma);
    }
}
