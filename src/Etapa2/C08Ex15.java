package Etapa2;

import java.util.Scanner;

public class C08Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nome, cargo, nomeMaiorSalario = null;
        int numeroDeFuncionarios = 1000, idade, idadeAte18Anos = 0, senioridade = 0;
        double salario, salarioAte18Anos = 0, maiorSalario = 0;

        for (int i = 0; i < numeroDeFuncionarios; i++) {
            System.out.println ("Digite o nome do funcionário: ");
            nome = scanner.nextLine ();
            System.out.println ("Digite o cargo do funcionário: ");
            cargo = scanner.nextLine ();
            System.out.println ("Digite a idade do funcionário: ");
            idade = scanner.nextInt ();
            scanner.nextLine ();
            System.out.println ("Digite o salário do funcionário: ");
            salario = scanner.nextDouble ();
            scanner.nextLine ();

            if (idade <= 18) {
                salarioAte18Anos += salario;
                idadeAte18Anos++;
            } else if (idade > 50 && salario > 10000) {
                senioridade++;
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                    nomeMaiorSalario = nome;
                }
            }
        }

        System.out
                .printf ("A média salarial dos funcionários com até 18 anos é: %.2f\n", salarioAte18Anos / idadeAte18Anos)
                .printf ("O número de funcionários com mais de 50 anos e salário maior que" +
                        " R$ 10.000,00 é: %d\n", senioridade)
                .printf ("O nome do funcionário com maior salário é: %s\n e o salário é %.2f", nomeMaiorSalario, maiorSalario);

        scanner.close ();
    }
}
