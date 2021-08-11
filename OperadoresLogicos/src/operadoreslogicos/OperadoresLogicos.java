/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author joao.melo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y && x<z)?true:false;  // x é menor que y e x é menor que z
           System.out.println(r);  // true
           
        r = (x<y && x==z)?true:false;  // x é menor que y e x é igual a z
           System.out.println(r);  // false
           
        r = (x<y || x==z)?true:false;  // x é menor que y ou  x é igual a z
           System.out.println(r);  // true
           
        r = (x<y ^ x==z)?true:false;  // x é menor que y ou  x é igual a z
           System.out.println(r);  // true
           
       r = (x<y ^ y<z)?true:false;  // x é menor que y ou  x é menor que  z
           System.out.println(r);  // false
           
       
        
        
        
        
        
    }
    
}
