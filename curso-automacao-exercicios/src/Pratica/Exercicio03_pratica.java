package Pratica;

import javax.swing.JOptionPane;

public class Exercicio03_pratica {
    
    public static void main(String[] args) {
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        int v3 = valor2;
        valor2 = valor1;
        valor1 = v3;

        System.out.println("O primeiro valor digitado foi: " + valor1);
        System.out.println(valor2);
    }
}
