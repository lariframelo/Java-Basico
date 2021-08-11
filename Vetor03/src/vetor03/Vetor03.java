/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author joao.melo
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5 };
        Arrays.sort(v); // SORTEAR UM VETOR 
        
        for (double valor:v) {
            System.out.print(valor + "  -  ");
        }
        
        int num[] = {3, 5, 1, 8, 4};
        
        int pos = Arrays.binarySearch(num, 1); // localizar
        
        System.out.println("Posição foi encontrada " + pos);
        
        
        
        
        
    }
    
}
