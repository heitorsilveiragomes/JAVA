package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        List<String> listaNomes = new ArrayList<String>();
        List<Double> ListaSalario = new ArrayList<Double>();
        String nome;
        double salario, acrescimosalario;

        do {
            System.out.println("Digite seu nome (X para encerrar):");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                listaNomes.add(nome);
                System.out.print("Digite seu salário: ");
                salario = teclado.nextDouble();
                ListaSalario.add(salario);
                System.out.println("Digite o acréscimo do salário: ");
                acrescimosalario = teclado.nextDouble();
                teclado.nextLine();
                for (int aux = 0; aux < listaNomes.size(); aux++) {
                    ListaSalario.set(aux, ListaSalario.get(aux) * (acrescimosalario / 100));
                }
            }
        }while(!nome.equalsIgnoreCase("X"));
        for (int aux = 0; aux < listaNomes.size(); aux++){
            System.out.println("O nome: " + listaNomes.get(aux) + " o salário é "+ ListaSalario.get(aux));
        }
    }
}
