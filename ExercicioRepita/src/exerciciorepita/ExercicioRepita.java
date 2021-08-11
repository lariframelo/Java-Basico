/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;


/**
 *
 * @author joao.melo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // mostrando - JOptionPane.showMessageDialog(null,"Olá Mundo!!!","Boas Vindas !", JOptionPane.INFORMATION_MESSAGE);
        // outro modo   JOptionPane.showMessageDialog(null,"Voce digitou o número "  + n);
        int n, s = 0;
        int nvalores = 0;
        int npares = 0;
        int nimpares = 0;
        int nacima100 = 0;
        int nmedia = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe o número: <br><em>( Valor 0 Interrompe!)</em></html>"));
            s += n;
            nvalores++;
            if ((n%2) == 0) { npares++; 
            }
            else { nimpares++;
            }
            if (n > 100 ) {
                nacima100++;
            } 
            nmedia = ( s /nvalores);
        } 
            while (n != 0);
      JOptionPane.showMessageDialog(null, "<html> Resultado Final <hr> "  + 
              "<br> Somatório vale " + s + "</br>" +
              "<br> Total de Valores " + nvalores + "</br>" +
              "<br> Total de Pares " + npares + "</br>" +
              "<br> Total de Impares " + nimpares + "</br>" +
              "<br> Acima de 100 " + nacima100 + "</br>" +
              "<br> Média dos Valores " + nmedia + "</br>" +
               "</html>");
        
    }
    
}
