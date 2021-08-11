/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author joao.melo
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
         
        int numero = 5;
        numero++;
        int valor = 5 + numero++;
        System.out.println(numero);
        System.out.println(valor);
        
        
        int numero2 = 10;
        int valor2 = 4 + numero2--;
        System.out.println(valor2);
        System.out.println(numero2);
        
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        
        float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
        
        double ale = Math.random();
        System.out.println(ale);
        
        double ale2 = Math.random();
        int n = (int) (1 + ale2 * (50-1));   // de 1 ate 50
        System.out.println(n);
        
        double pi3 = Math.PI;   // PI
        System.out.println(pi3);
        
        double exp = Math.pow(5, 2); // exponenciação
        System.out.println(exp);
        
        double raiz = Math.sqrt(25); // raiz quadrada
        System.out.println(raiz);
        
        
        
        
        
        
          
          
          
        
        
        
    }
    
}
