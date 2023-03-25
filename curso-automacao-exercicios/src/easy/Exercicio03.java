package easy;
import javax.swing.JOptionPane;

public class Exercicio03 { // Inicio classe

    //static String primeiroValor; // Declarando variavel do tipo texto
    //static String segundoValor; // Declarando variavel do tipo texto
    
    public static void main(String[] args) { // Inicio metodo
        String primeiroValor; // Declarando variavel do tipo texto
        String segundoValor; // Declarando variavel do tipo texto 

       primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor"); // Primeiro valor = Ler
       segundoValor = JOptionPane.showInputDialog("Digite o segundo valor"); // segundo valor = Ler

       String terceiroValor;
       
       terceiroValor = segundoValor;
       segundoValor = primeiroValor;
       primeiroValor = terceiroValor;

System.out.println("Primeiro valor digitado:"+ primeiroValor); // exibir "Primeiro valor digitado:" + segundo valor
System.out.println("Segundo valor digitado:" + segundoValor); // exibir "Primeiro valor digitado:" + primeiro valor
    } 
    
}
