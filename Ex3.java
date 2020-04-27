package ex3;

/**
 *
 * @author Rafael Gusmão
 */
public class Ex3 {

    public static void main(String[] args) {
        int c;
        float f;
        
        for(c = 50; c <= 150; c++){
            f = (9*c + 160) / 5;
            System.out.println(c + "ºC = " + f + "ºF");
        }    
    }    
}
