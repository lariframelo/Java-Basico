/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author joao.melo
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<10) {
            cc++;
            // comando continue vai para inicio do laço
            if (cc==5 || cc==6) {
                continue;
            }
            if (cc==7) {
                break;  // sai fora do loop
            }
            System.out.println("Cambalhota de número: " + cc);
        }
        
        
    }
    
}
