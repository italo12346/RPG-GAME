
package rpggame;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author FlameRazer
 */
public class RpgGame {
       public Scanner ler = new Scanner(System.in);
       Jogador p1 = new Jogador();
       
       
       
       static int ataqueComputador(){
           Random gerador = new Random();
           return gerador.nextInt(3)+1; // retorna um numero entre 1 e 3
       }
       
       
       public int batalha(String player){  // Onde as batalhas vão ocorrer
           p1.hpPlayer = 150;
           int hpPc;
                             // O jogador só pode usar o especial 5x por batalha
           int contagemEspecialPC = 5;
           int escolhaAtaque;
           int i=1; //adversarios
          while(p1.hpPlayer > 0){
               hpPc = 14+i;
               System.out.println("\n=-=-=-=-=-=-=-=-=");
               System.out.println("INIMIGO "+i);
               System.out.println("=-=-=-=-=-=-=-=-=\n");
               
               while(p1.hpPlayer > 0 && hpPc > 0){ // batalha 
                   
                    p1.imprimeHP(hpPc);
                    
                    escolhaAtaque = p1.ataqueUsuairio();
                    switch(escolhaAtaque){
                            case 1:
                                int soco=7+p1.melhorAttack;
                                System.out.println(player+" aplicou um SOCO...// Inimigo perde 7 hp");
                                hpPc -= soco;
                                break;       
                            case 2: 
       
                                if(p1.verificarEsp==true){
                                    int especial=20;
                                     System.out.println(player+" aplicou um ATAQUE ESPECIAL...// Inimigo perde 20 Hp");
                                      hpPc -= especial;
                                    p1.usarContagemEsp();
                                    
                                }else{
                                    System.out.println("você não pode usar mais especiais ");
                                }
                               break;
                                
                            default:
                                System.out.println("Opção invalida.....Perdeu a jogada");
                           
                    }
                    
                    if(hpPc > 0){
                        escolhaAtaque = ataqueComputador();
                        switch(escolhaAtaque){
                            case 1:
                                int dano1=5;
                                System.out.println("Adversario aplicou um SOCO...// "+player+" perde  "+dano1+" HP");
                                p1.hpPlayer -= dano1 + (int)(i/10);
                                
                            break;    
                            case 2:
                                int dano2=6;
                                System.out.println("Adversario aplicou um CHUTE...// "+player+" perde "+dano2+" HP");
                                p1.hpPlayer -= dano2 + (int)(i/10);
                            break;
                            case 3:
                                int dano3=10;
                                System.out.println("Adversario aplicou um ATAQUE ESPECIAL...// "+player+" perde"+dano3+" HP");
                                p1.hpPlayer -= dano3 + (int)(i/20);
                                contagemEspecialPC--; 
                            break;
                  
                        }
                    
                }else{
                        System.out.println("Adversario caiu...."+player+" VENCEU");
                    }
           }
               if(p1.hpPlayer >0){  
                   p1.hpPlayer+=5; // recupera 5 hp a cada batalha
                   System.out.println("voce recuperou 5 de HP");
                   if(i % 10 == 0){
                      p1.recuperarContagemEsp();// RECUPERA UM ATAQUE ESPECIAL A CADA 10 INIMIGOS

                  } 
               }
               
               if(i==10){
                   p1.melhorarAtaque();
                   System.out.println("_____________________________");
                   System.out.println("ataque soco ganha 1 de dano ");
                   System.out.println("_____________________________");
               }
           i++;
           
      } 
          
           return i;
 }
       
       
       public void Game() {
           Scanner guardar= new Scanner(System.in);
           int continua=1;
           int record;
            
           System.out.println("Informe seu nome bravo guerreiro(a): ");
           p1.nome = ler.nextLine();
           while(continua==1){
               //Realiza o game
               record = batalha(p1.nome);
               System.out.println("___GAME OVER___Deseja continuar? (1)sim (2) Não");
               System.out.println("RECORD SCORE "+ record);
               continua = ler.nextInt()-1;
           }   
                         
    }
    public static void main(String[] args) {
        RpgGame game = new RpgGame();
        game.Game();
    }
}

