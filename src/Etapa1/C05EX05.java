package Etapa1;
import java.util.Scanner;
public class C05EX05 {
    public static void main(String[] args) {
        double temperatura, Kelvin, Fahrenheit;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a Temperatura : ");
        temperatura = teclado.nextDouble();
        Kelvin = temperatura + 273;
        Fahrenheit = (temperatura * 1.8) + 32;
        System.out.println("A seguir as temperaturas são:"+"\n"+temperatura+" Celsius"+"\n"+Kelvin+" Kelvins"+"\n"+Fahrenheit+" Fahrenheits");
        teclado.close();

    }
}

