package prj;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        
        int numero = entrada.nextInt();
        int i, par;
        
        for(i = 1; i <= numero; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
