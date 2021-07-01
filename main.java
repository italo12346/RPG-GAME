
/**
 *
 * @author Italo Souza Sampaio
 */
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int estoqueCamisa = 25;
        int estoqueCaneca = 10;
        int num;
        String user;
        String consulta,add;
        
        Scanner texto = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Olá, qual o seu nome ?");
        user = texto.nextLine();
        System.out.println("Bem vindo " + user);
        System.out.println("O que deseja consultar ?");
        consulta=texto.nextLine();
        
        if("camisas".equals(consulta)){
        System.out.println( estoqueCamisa + " Camisas em estoque"  );
        
         System.out.println("Deseja adicionar alguma ?");
         add = texto.nextLine();
          if("sim".equals(add)){       
             System.out.println("Quantas deseja adicionar ?");
             num =ler.nextInt();
             estoqueCamisa= estoqueCamisa +num;
             System.out.println("O total de camisas agora e: " + estoqueCamisa);
        }
          
    }
    
         if("canecas".equals(consulta)){
        System.out.println( estoqueCaneca + " Canecas em estoque"  );
         System.out.println("Deseja adicionar alguma ?");
         add = texto.nextLine();
          if("sim".equals(add)){       
             System.out.println("Quantas deseja adicionar ?");
             num =ler.nextInt();
             estoqueCaneca = estoqueCaneca + num;
             System.out.println("O total de canecas agora e: " + estoqueCaneca);
        }
    }
         
 }
        
}
