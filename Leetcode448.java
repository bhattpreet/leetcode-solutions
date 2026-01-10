import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class Leetcode448 {
    public static void main(String[] args){
        int arr[] = {1,1};
        swap(arr);
        List<Integer> l = new ArrayList<>();
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= i+1 ){
                l.add(i+1);
            }
        }
        System.out.println(l);
    }
    public static void swap(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[correct]!=arr[i]){
                swap(correct , i , arr);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int i , int  c, int [] arr){
        int t= arr[i];
        arr[i] = arr[c];
        arr[c] = t;
    }
}
