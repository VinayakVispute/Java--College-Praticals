abstract class A{
    public abstract void display();
}

class A1 extends A{
    public void display(){
        System.out.println("This is A1's Display method.");
    }
}

class A2 extends A{
    public void display(){
        System.out.println("This is A2's Display method.");
    }
}


public class pratical27{
    public static void main(String[] args){
        A1 a1_object = new A1();
        a1_object.display();

        A2 a2_object = new A2();
        a2_object.display();
    }
}