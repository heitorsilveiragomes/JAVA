package Etapa1;

import java.util.Scanner;

public class C04EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sobrenome, PrimeiroNome, SegundoNome;
        long Idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu Sobrenome: ");
        Sobrenome = teclado.nextLine();
        System.out.print("Informe seu Primeiro nome: ");
        PrimeiroNome = teclado.nextLine();
        System.out.print("Informe seu Segundo nome: ");
        SegundoNome = teclado.nextLine();
        System.out.print("Informe sua Idade: ");
        Idade = sc.nextLong();

        System.out.println(Sobrenome+", "+ PrimeiroNome+" "+ SegundoNome);
        System.out.println("Idade: "+Idade+" anos.");
        teclado.close();

    }





}
