package easy;
import javax.swing.JOptionPane; 

public class Exercicio02 { // inicio da classe

  public static void main(String[] args) { // Metodo

    String palavraDigitada; // Declarar variavel do tipo texto: palavraDigitada;

    palavraDigitada = JOptionPane.showInputDialog("Digite uma palavra!"); //palavraDigitada = Ler ("Helo world!");

    System.out.println("O usuario digitou :"+palavraDigitada);// Exibir: "O Usuario digitou: "+palavraDigitada
  } // Fim metodo
} // fim da classe
