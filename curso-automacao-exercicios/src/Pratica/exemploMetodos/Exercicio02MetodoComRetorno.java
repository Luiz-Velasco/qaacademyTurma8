package Pratica.exemploMetodos;

public class Exercicio02MetodoComRetorno {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(metodoUm());
        System.out.println(metodoDois());
        System.out.println(metodoTres());
        System.out.println(metodoQuatro());
        System.out.println(metodoCinco());
    }    
    
    /**
     * @return
     */
    public static String metodoUm() {
        String mensagem = "primeiroMetodo";
        return mensagem;
    }

    public static int metodoDois() {
        return 17;
    }

    public static double metodoTres() {
        return 3.0;
    }

    public static boolean metodoQuatro() {
        return true;
    }

    public static String metodoCinco() {
        return "quintoMetodo";
    }


}
