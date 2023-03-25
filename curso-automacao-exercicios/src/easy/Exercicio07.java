package easy;
import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {

    double salario, inss =0.0; //declaração das variaveis
    String salarioStg = JOptionPane.showInputDialog("Digite um valor de salario"); //Leitura de digitação do usuario
    salario = Double.parseDouble(salarioStg); //Conversão e atribuição na variavel salario

    if (salario <= 1045.00){ //Abertura do IF (SE)
        inss = salario * 0.075; // 7,5%
    } // Fim do IF (SE)

    if (salario >= 1045.01 && salario <= 2089.60){ //Abertura do IF (SE)
        inss = salario * 0.09; // 9%
    } // Fim do IF (SE)

    if (salario >= 2089.61 && salario <= 3134.40){ //Abertura do IF (SE)
        inss = salario * 0.12; // 12%
    } // Fim do IF (SE)

    if (salario >= 3134.41 && salario <= 6101.06){ //Abertura do IF (SE)
        inss = salario * 0.14; //14%
    } // Fim do IF (SE)

    if(salario > 6101.06){ //Abertura do IF (SE)
        inss = 854.15;
    } // Fim do IF (SE)
    System.out.println("O valor do inss a ser pago é R$" + inss);
    }
}
