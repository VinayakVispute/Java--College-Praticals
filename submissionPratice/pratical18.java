import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;

public class pratical18{
    public static void main(String[] args){
        int size = Integer.parseInt(args[0]);
        int arr[] = new int[size];

        for(int i = 0;i < size;i++){
            arr[i] =Integer.parseInt(args[i+1]);
        }

        System.out.println("Array without sort is as follows : ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Array Sorted is as follows : ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}