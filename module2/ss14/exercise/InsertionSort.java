package ss14.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void insertiongSort(int[] arr){
        int x ,pos;
        for (int i = 0; i < arr.length ; i++) {
             x=arr[i];
             pos =i;
             while (0<pos && x <arr[pos-1]){
                 arr[pos]=arr[pos-1];
                 pos--;
                 System.out.println("Vong lap while da chay");
             }
             arr[pos] = x;
            System.out.println("lan thu "+i+":"+ Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] numbers = {17, 11, 10, 2, 66, 13};
        insertiongSort(numbers);
    }
}
