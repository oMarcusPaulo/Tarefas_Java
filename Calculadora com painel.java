import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Calc {
    public static void main (String[]args){
        
        String escolha = JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO: 1 - SOMA, 2 - SUBTRAÇÃO, 3 - MULTIPLICAÇÃO E 4 - DIVISÃO"); 
        if(escolha.equals("1")){
           String firstnumber  = JOptionPane.showInputDialog("Insira o primeiro número"); 
           String secondnumber  = JOptionPane.showInputDialog("Insira o segundo número");
           
           int number1 = Integer.parseInt(firstnumber);
           int number2 = Integer.parseInt(secondnumber);
           
           int soma = number1 + number2;
       
           JOptionPane.showMessageDialog(null,"A soma é: "+soma, "SOMA dos dois inteiros",JOptionPane.PLAIN_MESSAGE);
        }else{
            if(escolha.equals("2")){
                 String firstnumber  = JOptionPane.showInputDialog("Insira o primeiro número"); 
                 String secondnumber  = JOptionPane.showInputDialog("Insira o segundo número");
           
                int number1 = Integer.parseInt(firstnumber);
                int number2 = Integer.parseInt(secondnumber);
           
                int sub = number1 - number2;
       
                JOptionPane.showMessageDialog(null,"A subtração é: "+sub, "dos dois inteiros",JOptionPane.PLAIN_MESSAGE);
                
            }else{
                if(escolha.equals("3")){
                    String firstnumber  = JOptionPane.showInputDialog("Insira o primeiro número"); 
                    String secondnumber  = JOptionPane.showInputDialog("Insira o segundo número");

                   int number1 = Integer.parseInt(firstnumber);
                   int number2 = Integer.parseInt(secondnumber);

                   int mult = number1 * number2;

                   JOptionPane.showMessageDialog(null,"A multiplicação é: "+mult, "dos dois inteiros",JOptionPane.PLAIN_MESSAGE);
                }else{
                    if(escolha.equals("4")){
                        String firstnumber  = JOptionPane.showInputDialog("Insira o primeiro número"); 
                        String secondnumber  = JOptionPane.showInputDialog("Insira o segundo número");

                        double number1 = Integer.parseInt(firstnumber);
                        double number2 = Integer.parseInt(secondnumber);

                            double div = number1 / number2;
                            JOptionPane.showMessageDialog(null,"divisao é: "+div, "dos dois inteiros",JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        }
    }
}
