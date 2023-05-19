import java.lang.*;

public class pratical20 {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(25);
        s1.push(20);
        s1.push(15);
        s1.display();
        s1.pop();
        s1.display();
    }
}


public class Stack {
    int size;
    int[] stack;
    int top = -1;

    Stack(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        int temp = stack[top];
        top--;
        System.out.println("Element Poped From Stack: " + temp);
        return temp;
    }

    void push(int n) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            this.stack[top] = n;
            System.out.println("Element Pushed In Stack: " + n);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        for (int i = top; i > 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
}

