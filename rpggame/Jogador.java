
package rpggame;

import java.util.Scanner;


/**
 *
 * @author FlameRazer
 */
public class Jogador {
    public String nome;
    public int hpPlayer;
    private int contagemEspecial=5; // O jogador só pode usar o especial 5x por batalha
    public boolean verificarEsp=true;
    public int melhorAttack=0;
    
    public Scanner ler = new Scanner(System.in);
    
     public int ataqueUsuairio(){
           System.out.println("Escolha seu ataque: ");
           System.out.println("(1) - Soco ");
           System.out.println("(2) - Especial");
           
           return ler.nextInt();
           
       }
     public void imprimeHP( int hpPc){
           System.out.println("=============================");
           System.out.println("- HP player: "+this.hpPlayer);
           System.out.println("- HP PC: "+ hpPc);
           System.out.println("* Contagem de Especiais: "+this.contagemEspecial);
           System.out.println("=============================");

       }
     public void usarContagemEsp(){
         this.contagemEspecial--;
         if(contagemEspecial<=0){

             contagemEspecial=0;
             verificarEsp = false;
         }
     }
     
     public void recuperarContagemEsp(){
         this.contagemEspecial++;
         verificarEsp=true;
         System.out.println("voce recuperou 1 especial ");
         if(this.contagemEspecial>5){
             this.contagemEspecial=5;
             
         }
     }
     public void melhorarAtaque(){
        melhorAttack++;
        
     }
     
     
     

}


