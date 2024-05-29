package Etapa2;

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome,cod,nomeMenorSalario = "",menorCargo = "", msg = "";
        int salario,salarioMin = 0, numFun;
        double contEngAci = 0, salarioADM = 0,contAdm = 0;
        double contOutros = 0, menorSalrio = 0;
        double mediaAdm = 0;

        System.out.println("Digite o numero de funcionarios");
        numFun = sc.nextInt();
        sc.nextLine();

        for (int i=1;i<=numFun;i++) {
            System.out.println("Insira seu nome: ");
            nome = sc.nextLine();
            System.out.println("Insira o codigo do seu cargo: ");
            cod = sc.nextLine();
            System.out.println("Insira seu salario: ");
            salario = sc.nextInt();
            sc.nextLine();

            if (cod.equalsIgnoreCase("C")) {
                salarioMin = 2500;
            } else if (cod.equalsIgnoreCase("P")) {
                salarioMin = 4650;
            } else if (cod.equalsIgnoreCase("O")) {
                salarioMin = 3200;
            } else if (cod.equalsIgnoreCase("A")) {
                salarioMin = 5100;
            } else if (cod.equalsIgnoreCase("X")) {
                salarioMin = salario;
            } else {
                System.out.println("Codigo não aceito");
            }

            System.out.println(salarioMin);

           if (cod.equalsIgnoreCase("C") || cod.equalsIgnoreCase("O") || cod.equalsIgnoreCase("A")
                    || cod.equalsIgnoreCase("P") && salario < salarioMin) {
                msg = " SEU SALARIO ESTA ABAIXO DO SALARIO MINIMO mate o responsavel pelo rh";
            }else {
                msg = "";
            }


            if (salario < salarioMin){
                System.out.println("Bosta");
            }

            if (cod.equalsIgnoreCase("C") || cod.equalsIgnoreCase("O") || cod.equalsIgnoreCase("A")
                    || cod.equalsIgnoreCase("P") && salario >= salarioMin){
                contEngAci++;
            }

            if (cod.equalsIgnoreCase("A")){
                salarioADM += salario;
                contAdm++;
            }

            if (cod.equalsIgnoreCase("O") && salario > 5000){
                contOutros++;
            }

            if (i ==1 || salario < menorSalrio){
                menorSalrio = salario;
                nomeMenorSalario = nome;
                menorCargo = cod;
            }

          //  System.out.println("Nome:      Cargo:      Salario:      Saida de dados");
            System.out.println(nome + "      " + cod + "      " + salario + "      " + msg);
            msg = "";
        }
        System.out.println(msg);

        mediaAdm = salarioADM/contAdm;
        System.out.printf("Média dos salários dos Administradores R$ %.2f%n", mediaAdm);
        System.out.println("Quantidade de salários acima do mínimo " + contEngAci);
        System.out.println("Quantidade de engenheiros de cargo 'Outros' que recebem acima de R$5000 " + contOutros);
        System.out.println("Nome, cargo e salário do engenheiro de menor salário = " + nomeMenorSalario + ", " +
             menorCargo + ", R$" + menorSalrio);


        sc.close();
    }
}
