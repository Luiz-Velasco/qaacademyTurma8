package exemploMetodos;

import javax.swing.JOptionPane;

public class ExemploMetodoComParametro {

    public static void main(String[] args) {
        exemploComParametros(30, "Luiz Velasco");
    }

    public static void exemploComParametros(int numeroEnviado, String palavaEnviada){
        numeroEnviado = numeroEnviado * 2;
        System.out.println(numeroEnviado);
        System.out.println(palavaEnviada);

    }
    
}
