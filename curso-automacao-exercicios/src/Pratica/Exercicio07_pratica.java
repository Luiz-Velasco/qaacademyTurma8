package Pratica;

import javax.swing.JOptionPane;

public class Exercicio07_pratica {
    public static void main(String[] args) {
        double salario = Integer.parseInt(JOptionPane.showInputDialog("Informe o salario"));
        double inss = 0.0;

        if(salario <= 1045.00){
            inss = salario * 0.075;
        }

        if(salario >= 1045.1 && salario <= 2089.60){
            inss = salario * 0.09;
        }

        if(salario >= 2089.61 && salario <= 3134.40){
            inss = salario * 0.12;
        }

        if(salario >= 3134.41 && salario <= 6101.06){
            inss = salario * 0.14;

        }

        System.out.println("O valor do inss a pagar é: " + inss);


    }
}
