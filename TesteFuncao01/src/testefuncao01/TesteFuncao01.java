/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author joao.melo
 */
public class TesteFuncao01 {
    
    static void soma(int a, int b) {
        int s = a + b;
        
        System.out.println("A soma é " + s);
    }
    
    static int somaf(int a, int b) {
        int s = a + b;
        
        return(s);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o pragrama!!!!!!");
        soma(5,3);
        
        
        System.out.println("Pela função somaf " + somaf(5,5));
        
        
        
        
        
        
    }
    
}
