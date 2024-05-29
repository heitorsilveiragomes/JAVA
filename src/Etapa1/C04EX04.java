package Etapa1;

import javax.swing.JOptionPane;
import javax.swing.text.html.Option;

public class C04EX04 {
    public static void main(String[] args) {

        String Primeironome, nomedomeio, sobrenome;
        Integer Idade;
        Primeironome = JOptionPane.showInputDialog(
                "Digite seu primeiro nome!:");
        nomedomeio= JOptionPane.showInputDialog(
        "Digite seu nome do meio!:");
        sobrenome= JOptionPane.showInputDialog(
                "Digite seu sobrenome!:");
        Idade= Integer.parseInt(JOptionPane.showInputDialog(
                "Digite sua idade!:"));

        JOptionPane.showMessageDialog(null,
        Primeironome +" " + nomedomeio + " " + sobrenome + "\n" + "idade " + Idade + " anos");


    }
}
