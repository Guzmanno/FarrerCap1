package ex4;
import java.util.Scanner;

/**
 *
 * @author Rafael Gusmão
 */
public class Ex4 {

    public static void main(String[] args) {
        String nome;
        int menor10 = 0, entre10e20 = 0, maior20 = 0;
        float compra, venda, lucro, compraTotal = 0, vendaTotal = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome da mercadoria (para sair, digite 0): ");
        nome = sc.next();
        
        while(!(nome.equals("0"))){
            System.out.print("Digite o valor de compra: ");
            compra = sc.nextFloat();
            compraTotal += compra;
            System.out.print("Digite o valor de venda: ");
            venda = sc.nextFloat();
            vendaTotal += venda;
            
            lucro = venda / compra;
            
            if(lucro < 1.1){
                menor10++;
            }
            else if(lucro >= 1.1 && lucro <= 1.2){
                entre10e20++;
            }
            else{
                maior20++;
            }
            
            System.out.print("Digite o nome da mercadoria: ");
            nome = sc.next();
        }
        
        System.out.println("\nLucro menor que 10%: " + menor10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro maior que 20%: " + maior20);
        System.out.println("Lucro total: " + (vendaTotal - compraTotal));
        
    }
    
}
