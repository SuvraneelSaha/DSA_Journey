package org.example;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
    }

        public void rotate(int[] arr, int k) {
            k=k%arr.length;
            if(k < 0){
                k += arr.length;
            }
            // Below is for right Rotate
            rev(arr,0,arr.length-1);
            rev(arr,0,k-1);
            rev(arr,k,arr.length-1);
            // below is for left Rotate
            // rev(arr,0,k-1);
            // rev(arr,k,arr.length-1);
            // rev(arr,0,arr.length-1);
        }
        public static void rev(int[] arr , int i , int j)
        {
            while(i<=j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

}
