
package primeirotrabalhoapiii;

import primeirotrabalhoapiii.ListaEncadeada.MergeSort;
import static primeirotrabalhoapiii.ListaEncadeada.QuickSort_Recursive;
/**
 *
 * @author guilh
 */
public class Primeirotrabalhoapiii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dado = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
        int len = 9;
        System.out.println("QuickSort Recursivo");

        QuickSort_Recursive(dado, 0, len - 1);
            for (int i = 0; i < 9; i++)
                System.out.println(dado[i]);
                System.out.println();
                
    
    }
    
}
