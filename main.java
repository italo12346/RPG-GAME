
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
        int estoqueRoupas = 5;
        int estoqueQuadros = 2;
        int num;
        String consulta, user,add = null;

        Scanner texto = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome ?");
        user = texto.nextLine();
        System.out.println("Bem vindo " + user);
        System.out.println("O que deseja consultar ? \n * 1 Camisas \n * 2 Canecas \n * 3 Roupas \n * 4 Quadros");
        consulta = ler.nextLine();
        
        switch (consulta) {
            case "1":
                System.out.println(estoqueCamisa + " Camisas em estoque");

                System.out.println("Deseja adicionar alguma ?");
                add = texto.nextLine();

                if ("sim".equals(add)) {
                    System.out.println("Quantas deseja adicionar ?");
                    num = ler.nextInt();
                    estoqueCamisa = estoqueCamisa + num;
             
                    System.out.println("O total de camisas agora e: " + estoqueCamisa);
                    
                    System.out.println(user+"... Deseja consultar mais alguma categoria ? " );
                    add = texto.nextLine();                   
               }
                if("sim".equals(add)){
                    System.out.println("__________\n");
                }else {
                    System.out.println("Tchau");
                    break;
                }
            case "2":
                System.out.println(estoqueCaneca + " Canecas em estoque");
                System.out.println("Deseja adicionar alguma ?");
                add = texto.nextLine();

                if ("sim".equals(add)) {
                    System.out.println("Quantas deseja adicionar ?");
                    num = ler.nextInt();
                    estoqueCaneca = estoqueCaneca + num;
                    System.out.println("O total de canecas agora e: " + estoqueCaneca);
                    
                    System.out.println(user+"... Deseja consultar mais alguma categoria ? " );
                    add = texto.nextLine();                   

                }
                 if("sim".equals(add)){
                    System.out.println("__________\n");
                }else {
                    System.out.println("Tchau");
                    break;
                }

            case "3":
                System.out.println(estoqueRoupas + " Roupas em estoque");
                System.out.println("Deseja adicionar alguma ?");
                add = texto.nextLine();
                if ("sim".equals(add)) {
                    System.out.println("Quantas deseja adicionar ?");
                    num = ler.nextInt();
                    estoqueRoupas = estoqueRoupas + num;
                    System.out.println("O total de roupas agora e: " + estoqueRoupas);
                    
                    System.out.println(user+"... Deseja consultar mais alguma categoria ? " );
                    add = texto.nextLine();                   
                }
                 if("sim".equals(add)){
                    System.out.println("__________\n");
                }else {
                    System.out.println("Tchau");
                    break;
                }

            case "4":
                 System.out.println(estoqueQuadros + " Quadros em estoque");
                System.out.println("Deseja adicionar alguma ?");
                add = texto.nextLine();

                if ("sim".equals(add)) {
                    System.out.println("Quantos deseja adicionar ?");
                    num = ler.nextInt();
                    estoqueQuadros = estoqueQuadros + num;
                    System.out.println("O total de Quadros agora e: " + estoqueQuadros);
                    
                    System.out.println(user+"... Deseja consultar mais alguma categoria ? " );
                    add = texto.nextLine();                   
                }
                 if("sim".equals(add)){
                    System.out.println("__________\n");
                }else {
                    System.out.println("Tchau");
                    break;
                }

        }

    }

}
