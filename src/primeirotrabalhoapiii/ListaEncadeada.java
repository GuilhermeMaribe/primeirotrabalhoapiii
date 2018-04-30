
package primeirotrabalhoapiii;
/**
 *
 * @author guilh
 */
public class ListaEncadeada<T> {
    private ListaNo<T> head;
    private ListaNo<T> tail;
	
    private static class ListaNo<T> {
	private T dado;
	private ListaNo<T> proximo;
	private ListaNo<T> anterior;
		
	public ListaNo(T dado, ListaNo<T> anterior, ListaNo<T> proximo) {
            this.dado = dado;
            this.proximo = proximo;
            this.anterior = anterior;
	}
    }
			
    public void append(T dado)	{
	ListaNo<T> novo = new ListaNo<>(dado, tail, null);
		
            if (tail != null) {
		tail.proximo = novo;
            }
            else {
		head = novo;
            }
		tail = novo;
    }
	
    public void addFirst(T dado)	{
	 ListaNo<T> novo = new ListaNo<>(dado, null, head);
	   head = novo;
		    
	    if(head != null){
               head.anterior = novo;
	    }
	    else {
	    	tail = novo;
	    }
    }

    public static int Partition(int[] dado, int anterior, int proximo) {

        int pivot = dado[anterior];

        while(true) {

            while(dado[anterior] < pivot)
                anterior++;

            while (dado[proximo] > pivot)
                proximo--;

            if (anterior < proximo) {
                int temp = dado[proximo];
                dado[proximo] = dado[anterior];
                dado[anterior] = temp;
            }
            else {
                return proximo;
            }

        }

    }

    public static void QuickSort_Recursive(int[] arr, int anterior, int proximo) {
        if(anterior < proximo) {
           int pivot = Partition(arr, anterior, proximo);

           if(pivot > 1)
              QuickSort_Recursive(arr, anterior, pivot - 1);

           if(pivot + 1 < proximo)
              QuickSort_Recursive(arr, pivot + 1, proximo);
        }
    }

    public static void main(String[] args) {

        int[] dado = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
        int len = 9;
        System.out.println("QuickSort By Recursive Method");

        QuickSort_Recursive(dado, 0, len - 1);
            for (int i = 0; i < 9; i++)
                System.out.println(dado[i]);
                System.out.println();
    }
}



