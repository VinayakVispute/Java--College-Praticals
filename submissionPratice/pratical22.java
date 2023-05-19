import java.util.Scanner;

public class pratical22{
    String studentName;
    int rollNo;
    int totalMarks;

    pratical22(){
        this.studentName="";
        this.rollNo=0;
        this.totalMarks=0;
    }

    pratical22(String name, int rollno, int totalmarks){
        this.studentName=name;
        this.rollNo=rollno;
        this.totalMarks=totalmarks;
    }

    void get_data(){
        System.out.println(studentName);
        System.out.println(rollNo);
        System.out.println(totalMarks);
    }
    public static void main(String[] args) {
        Scanner myObj  = new Scanner(System.in);
        System.out.println("Enter Object Values :- ");
        System.out.print("Enter Name of Student : ");
        String studentName = myObj.nextLine();
        System.out.print("Enter Enrollment No. : ");
        int rollNo = myObj.nextInt();
        System.out.print("Enter Total Marks : ");
        int totalMarks = myObj.nextInt();

        pratical22 p1 = new pratical22();
        pratical22 p2 = new pratical22(studentName,rollNo,totalMarks);
        p1.get_data();
        p2.get_data();
    }
}