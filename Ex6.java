package ex6;
import java.util.Scanner;

/**
 *
 * @author Rafael Gusmão
 */
public class Ex6 {
    
    public static void main(String[] args) {
        int segundos = 0, minutos = 0, horas = 0;
        float massaInicial, massa;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a massa inicial: ");
        massaInicial = sc.nextFloat();
        massa = massaInicial;
        
        while(massa >= 0.5){
            massa /= 2;
            segundos += 50;
        }
        
        if(segundos >= 60){
            minutos = segundos/60;
            segundos %= 60;
        }
        if(minutos >= 60){
            horas = minutos/60;
            minutos %= 60;
        }
        
        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massa);
        System.out.printf("Tempo decorrido: %d:%d:%d", horas, minutos, segundos);
    }
    
}
