package Etapa1;
import java.util.Scanner;

public class C04EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, CPF, identidade, tituloeleitor, empresa, carteira;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe seu CPF: ");
        CPF = teclado.nextLine();
        System.out.println("Informe sua identidade: ");
        identidade = teclado.nextLine();
        System.out.println("Informe seu título de eleitor: ");
        tituloeleitor = sc.nextLine();
        System.out.println("Informe sua carteira de motorista: ");
        carteira = sc.nextLine();
        System.out.println("Informe o nome de sua empresa: ");
        empresa= sc.nextLine();
        System.out.println("Informe seu salário: ");
        salario= sc.nextDouble();


        System.out.println("FICHA FUNCIONAL DE: "+" ---------------------"+ nome+"------------------------\n");
        System.out.println("Documentos: ");
        System.out.println("CPF ............................................. "+ CPF);
        System.out.println("C.I ............................................. "+ identidade);
        System.out.println("Título de Eleitor  ..............................  "+ tituloeleitor);
        System.out.println("Carteira de motorista ........................... "+ carteira+"\n");
        System.out.println("Nome da Empresa: "+ empresa);
        System.out.println("Salário: "+ salario);
        teclado.close();

    }
}
