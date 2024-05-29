package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> listaCPF = new ArrayList<>();
        List<String> listaEndereco = new ArrayList<>();
        String cpf = "";

        while (true) {
            System.out.print("Digite 0 para sair ou CPF:");
            cpf = teclado.nextLine();
            if (cpf.equals("0")) {
                break;
            }

            System.out.print("Digite seu endereço:");
            String endereco = teclado.nextLine();

            listaCPF.add(cpf);
            listaEndereco.add(endereco);
        }

        String cpfPesquisar = "";
        while (true) {
            System.out.print("Digite o CPF a ser pesquisado (ou 0 para sair):");
            cpfPesquisar = teclado.nextLine();
            if (cpfPesquisar.equals("0")) {
                break;
            }

            if (listaCPF.contains(cpfPesquisar)) {
                System.out.println("Você gostaria de alterar o endereço ou excluí-lo? (A/E)");
                String opcao = teclado.nextLine();
                if (opcao.equalsIgnoreCase("A")) {
                    System.out.println("Digite o novo endereço:");
                    String novoEndereco = teclado.nextLine();
                    listaEndereco.set(listaCPF.indexOf(cpfPesquisar), novoEndereco);
                } else if (opcao.equalsIgnoreCase("E")) {
                    int index = listaCPF.indexOf(cpfPesquisar);
                    listaCPF.remove(index);
                    listaEndereco.remove(index);
                }
            } else {
                System.out.println("CPF não encontrado, deseja cadastrar? (S/N)");
                String opcao = teclado.nextLine();
                if (opcao.equalsIgnoreCase("S")) {
                    System.out.print("Digite o endereço:");
                    String novoEndereco = teclado.nextLine();
                    listaCPF.add(cpfPesquisar);
                    listaEndereco.add(novoEndereco);
                }
            }
        }

        for (int i = 0; i < listaCPF.size(); i++) {
            System.out.println("CPF: " + listaCPF.get(i) + " - Endereço: " + listaEndereco.get(i));
        }

        teclado.close();
    }
}
