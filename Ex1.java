package ex1;
import java.util.Scanner;

/**
 *
 * @author Rafael Gusmão
 */
public class Ex1 {

    public static void main(String[] args) {
        float cont = 0, idade = 1, soma = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        
        while (idade != 0){
            soma += idade;
            cont++;
            System.out.println("Digite a sua idade:");
            idade = sc.nextInt();
        }
        
        System.out.println("A idade média dos indivíduos é " + soma/cont);        
    }    
}
