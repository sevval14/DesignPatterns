package templateMergeSort;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergeSort {
	public static void main(String[] args) {
		
	}
	//orjinal veriyi korumak için cloneluyoruz sıralama algoritmalarında bu genelde önemli

	private void sort(Object[] a) {
		Object aux[] = (Object[])a.clone();
		mergeSort(aux,a,0,a.length,0);
	}

	private void mergeSort(Object[] aux, Object[] a, int low, int length, int off) {
		for(int i=low ; i< length;i++) {
			for(int j=i; j>low && ((Comparable)a[j-1]).compareTo(a[j])>0; j--) {
				swap(a, j, j-1);
			}
		}
	}	
	
	private static void swap(Object[] arr, int i, int j) {
	    Object temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	
	
}
