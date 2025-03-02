package tp_mod_13_01;
/**
 *
 * @author Hafizryandin HM
 */
public class Array {
    public static void main(String[] args) {
        int[] arrayOne = {10, 20, 13, 15};
        int[] arrayTwo = {2, 5, 0, 3};
        
        for (int i = 0; i < arrayOne.length; i++) {
            try {
                int result = arrayOne[i] / arrayTwo[i];
                System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Terjadi error dalam kalkulasi pembagian (pembagian dengan nol)");
            }
        } 
    }
    
}
