import java.util.Scanner;



public class pratical4{
    public static boolean isPrime(int number){
    for(int i=2;i<=number/2;i++){
        if(number%i==0){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = myObj.nextInt();
        if(isPrime(number)){
            System.out.println("The Given Number "+number+" is Prime");
        }else{
            System.out.println("The Given Number "+number+" is Not Prime");

        }
    }
}