package Etapa2;

public class C09EX01 {
    public static void main(String[] args) {
        double cima,num, den,num1, serie=0;
        for (int aux=1; aux<=38; aux++) {
            den = aux;
            num = 39 - aux;
            num1 = 38 - aux;
            cima = num * num1;
            serie += cima / den;
        }
        System.out.print("Valor da Série = "+serie);
    }
}

