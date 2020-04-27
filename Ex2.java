package ex2;
import java.util.Scanner;

/**
 *
 * @author Rafael Gusmão
 */
public class Ex2 {

    public static void main(String[] args) {
        int i, sexo, numH;
        float altura, maiorAltura = 0, menorAltura = 0, somaM;
        Scanner sc = new Scanner(System.in);
        
        numH = 0;
        somaM = 0f;
        i = 0;
        
        while(i < 5){
            System.out.println("Digite o sexo (0 para masculino ou 1 para feminino):");
            sexo = sc.nextInt();
            
            if(sexo != 0 && sexo != 1){
                System.out.println("Opção inválida!");
            }
            else{
                System.out.println("Digite a altura, em metros:");
                altura = sc.nextFloat();
                
                if(sexo == 0){
                    numH++;
                }
                else{
                    somaM += altura;
                }
                
                if(i == 0){
                    menorAltura = altura;
                    maiorAltura = altura;
                }
                else{
                    if(altura < menorAltura){
                        menorAltura = altura;
                    }
                    else if(altura > maiorAltura){
                        maiorAltura = altura;
                    }
                }
                i++;
            }
        }
        
        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + somaM/(5-numH));
        System.out.println("Total de homens: " + numH);
    }
    
}
