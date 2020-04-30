package ex5;

/**
 *
 * @author Rafael Gusmão
 */
public class Ex5 {

    public static void main(String[] args) {
        float popA = 90000000, popB = 200000000;
        int anos = 0;
        
        while(popA < popB){
            popA *= 1.3;
            popB *= 1.15;
            anos++;
        }
        
        System.out.println("Serão necessários " + anos + " anos para que a "
                        + "população de A se iguale ou seja superior a de B");
    }
}