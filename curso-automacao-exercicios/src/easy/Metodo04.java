package easy;
import javax.swing.JOptionPane;
public class Metodo04 {
    /**
     * @param args
     * @param resultado 
     */
   
        public static void main(String[] args) {
            
        
        String p1 = "Olá ";
        String p2 = "Mundo";
        System.out.println(palavra(p1, p2));

        }
    

    public static String palavra(String p1, String p2){
        String resultado = p1 + p2;
        return resultado;
    }

}
