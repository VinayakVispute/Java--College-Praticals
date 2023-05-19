import java.util.Random;

public class pratica12{
    public static void main(String[] args) {
        Random random = new Random();
        int numberPlateNum = random.nextInt(9999);

        String numberPlateString = "";
        for(int i =0;i<4;i++){
            char temp = (char)('A'+random.nextInt(26));
            numberPlateString+=temp;
        }
        System.out.println("Generated Number Plate : "+numberPlateString+" "+numberPlateNum);
    }
}