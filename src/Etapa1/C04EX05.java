package Etapa1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class C04EX05 {
    public static void main(String[] args) {
        String nome, cpf, identidade, empresa;
        int titulo, carteira;
        double salario;

        Scanner arquivo = new Scanner(C04EX05.class.getResourceAsStream("ficha.txt"));
        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        identidade = arquivo.nextLine();
       
        titulo = arquivo.nextInt();
        carteira = arquivo.nextInt();
        arquivo.nextLine();
        empresa = arquivo.nextLine();
        salario = arquivo.nextDouble();

        JOptionPane.showMessageDialog(null,
                "\nFICHA FUNCIONAL DE: "+nome+"\nDocumentos"+"\nCPF............................................."+cpf+"\nC.I. ..............................................."+identidade+"\nTitulo de Eleitor..........................."+titulo+"\nCarteira de Motorista..................."+carteira+"\n\nEmpresa: "+empresa+"\nSalario: "+salario,
                "Ficha Funcional",
                JOptionPane.INFORMATION_MESSAGE);
       }
}