package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{ 45,65,71,23,42,12,34};
        Sort   thelist = new Sort();
        thelist.Quicksort(intArray,0,6);
        for(int i=0;i<7;i++)
        {
            System.out.print(intArray[i]+" ");
        }

    }
}
class Sort {
    public static void Quicksort(int[] arr,int p, int q)
    {
        if(p<q)
        {
            int partitionindex = partition(arr,p,q);
            Quicksort(arr,p,partitionindex-1);
            Quicksort(arr,partitionindex+1,q);

        }
    }
    public static int partition(int[] arr,int p,int q)
    {
        int pivot = arr[q];
        int partitionindex = p;

        for(int i= p;i<q;i++)
        {

            if(arr[i]<=pivot)
            {
                arr[i] = arr[i] ^ arr[partitionindex] ^ (arr[partitionindex] = arr[i]);
                partitionindex++;
            }
        }

        arr[partitionindex] = arr[partitionindex] ^ arr[q] ^ (arr[q] = arr[partitionindex]);
        return partitionindex;
    }
    public static void swap(int x,int y)
    {

        int temp;
        temp = x;
        x=y;
        y = temp;
    }
}
