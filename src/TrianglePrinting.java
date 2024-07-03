/**
 *
 * @author Azinm
 */


public class TrianglePrinting {
    public static void main(String[] args) {
        
        for (int line = 1; line <= 10; line++) {
            for (int stars=0; stars < line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int line = 1; line <= 10; line++) {
            for (int stars=10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int line = 1; line <= 10; line++) {
            for (int blank = 0; blank< line-1  ; blank++) {
                System.out.print(" ");
            }
            for (int stars=10; stars >= line; stars--) {
                System.out.print("*");
            }

            
            System.out.println();
        }
        System.out.println();
                
        
        for (int line = 1; line <= 10; line++) {
            for (int blank = 10; blank >= line+1 ; blank--) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
