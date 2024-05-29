package Etapa1;
import java.util.Scanner;
public class C05EX02 {
    public static void main(String[] args) {
        double raioesfera, area, volume;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do raio da esfera: ");
        raioesfera = teclado.nextDouble();
        area = 4 * 3.1416 * raioesfera * raioesfera;
        volume = 4.0 / 3 * 3.1416 * raioesfera * raioesfera * raioesfera ;
        System.out.println("A área é :"+ area +"/n"+"O Volume é:"+volume);
        teclado.close();


    }
}
