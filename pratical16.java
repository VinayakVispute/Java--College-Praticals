import java.util.Scanner;

public class pratical16{
    public static void reverse(int[] arr){
        int i=0;
        int temp;;
        while(i<arr.length/2){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            i++;
        }
        return;
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter 10 Numbers : ");
        int arr[] = new int[10];
        for(int i =0;i<10;i++){
            arr[i]=myObj.nextInt();
        }
        reverse(arr);
        System.out.println("After reversing numbers in an Array :");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}