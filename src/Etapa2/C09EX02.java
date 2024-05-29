package Etapa2;

public class C09EX02 {
    public static void main(String[] args) {
        double cima,num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = aux;
            den = Math.pow(aux,2)+ (aux - 1);
            serie += num / den;
        }
        System.out.print("Valor da Série = "+ serie);
    }
}
