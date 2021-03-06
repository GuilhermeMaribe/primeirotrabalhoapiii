
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
/*
    
    
    
    Tentativa MergeSort
    
    
    
    */
    public class MergeSort<T extends Comparable<T>>{
	
	public void ordena(T[] array, int indiceInicio, int indiceFim) {

		
		if (array != null && indiceInicio < indiceFim && indiceInicio >= 0 &&
		 indiceFim < array.length && array.length != 0) {
			int meio = ((indiceFim + indiceInicio) / 2);

			ordena(array, indiceInicio, meio);
			ordena(array, meio + 1, indiceFim);

			merge(array, indiceInicio, meio, indiceFim);
		}

	}

	
	public void merge(T[] array, int indiceInicio, int meio, int indiceFim) {

		T[] auxiliar =(T[]) new Comparable[array.length];
		
		for (int i = indiceInicio; i <= indiceFim; i++) {
			auxiliar[i] = array[i];
		}

		
		int i = indiceInicio;
		int j = meio + 1;
		int k = indiceInicio;

		
		while (i <= meio && j <= indiceFim) {
			if (auxiliar[i].compareTo(auxiliar[j]) < 0) {
				array[k] = auxiliar[i];
				i++;
			} else {
				array[k] = auxiliar[j];
				j++;
			}
			k++;
		}

		
		while (i <= meio) {
			array[k] = auxiliar[i];
			i++;
			k++;
		}

		
		while (j <= indiceFim) {
			array[k] = auxiliar[j];
			j++;
			k++;
		}
	}
    } 
}



