import java.lang.Exception;
import java.lang.String;


class ArgumentGreaterThanOne extends Exception{
    ArgumentGreaterThanOne(string e){
        super(e);
    }
}

public class pratical30{
    public static void main(Strinp[] args ) throws ArgumentGreaterThanOne{
        try{
            if(args.length>1){
                throw new ArgumentGreaterThanOne("Too many arguments provided.");
            }
            else{
                System.out.println("Successfully Run Without Exception.");
            }
        }

        catch(ArgumentGreaterThanOne e){
            System.out.println(e);
        }

            
    }
}