package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {
       double valorJuros;
       double taxaJuros = 0.05;
       double valorInvestimento;
       double valorTotal;

       valorInvestimento = 1000.00;
       valorJuros = (10 * taxaJuros) * valorInvestimento;
       valorTotal = valorJuros + valorInvestimento;

       System.out.println("Valor investido: R$" + valorInvestimento);
       System.out.println("Valor de juros: R$" + valorJuros);
       System.out.println("Valor de total de juros: R$" + valorTotal);

    }
    
}
