/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author lariframelo
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        
      //  for( int c=0; c<=5; c++) {      outra forma
          for (int c=0; c<n.length-1; c++) {
            
            System.out.println("Total de casas de N " + n.length);
            System.out.print(c); // ordem numerica
            
            System.out.print(n[c]); // na ordem das variaveis
            
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
        
        
    }
    
}
