package com.genericorder;
import java.lang.reflect.Array;

public class Utils {

    public static <T extends Number & Comparable<T>> T[] ordena(Object primArr)    
    {
        int length = java.lang.reflect.Array.getLength(primArr);
    
        T[] objArr = (T[]) new Number[length];

        for (int i = 0; i < length; i++) 
        {
            Object element = java.lang.reflect.Array.get(primArr, i);
            objArr[i] = (T) element;
        }

        QuickSort((T[])objArr, 0, length-1);

        return objArr;
    }

    private static <T extends Number & Comparable<T>> void QuickSort(T[] arr, int low, int high) 
    {
        if(low>=high)
        {
            return;
        }

        int p = partition(arr, low, high);
        QuickSort(arr, low, p-1);
        QuickSort(arr, p+1, high);
        return;
    }

    private static <T extends Number & Comparable<T>> int partition(T[] arr, int low, int high)
    {
        int i = low, j =high-1, pivot = high;

        while(i<=j)
        {
            while(i<high && arr[i].compareTo(arr[pivot])<0)
                i++;
            while(j>=low && arr[j].compareTo(arr[pivot])>0)
                j--;

            if(i<=j)
            {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        T temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static <T extends Number> void imprimir(T[] arr) 
    {
        for (T elemento : arr) 
        {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }   
}
