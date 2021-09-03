/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author lariframelo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustav";
        String nome3 = new String("Gustavo"); // mesmo conteudo mas diferente se comparado
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        String res2;
        res2 = (nome1.equals(nome3))?"igual":"diferente"; // mesmo conteudo 
        System.out.println(res2);
        
        
        
        
        
        
    }
    
}
