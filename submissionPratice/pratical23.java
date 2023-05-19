public class pratical23 {
    public String name;
    public int age;
    public double salary;
    public int empno;

    private static int nextEmpNo = 1; // Static variable to track the next employee number

    // Constructor to initialize instance variables and generate empno

    public pratical23(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empno = nextEmpNo;
        nextEmpNo++;
    }

    // Getter methods to access the instance variables

    public static void main(String[] args) {
        pratical23[] employees = new pratical23[10];

        employees[0] = new pratical23("John", 30, 50000.0);
        employees[1] = new pratical23("Mary", 28, 45000.0);
        employees[2] = new pratical23("David", 35, 60000.0);
        // Add more employees...

        // Accessing and displaying employee details
        for (pratical23 emp : employees) {
            System.out.println("Name: " + emp.name);
            System.out.println("Age: " + emp.age);
            System.out.println("Salary: " + emp.salary);
            System.out.println("Empno: " + emp.empno);
            System.out.println("-------------------------------------");
        }
    }
}
