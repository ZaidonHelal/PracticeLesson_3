import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String empName = input.nextLine();
        System.out.println("Please enter your age :");
        int empAge = input.nextInt();
        System.out.println("Please enter your salary :");
        double empSalary = input.nextDouble();
        System.out.println("Please enter your gpa :");
        double empgpa = input.nextDouble();

        System.out.println("-----------------");
        System.out.println("your Data :");
        System.out.println("Name : " + empName);
        System.out.println("Age : " + empAge);
        System.out.println("Salary : " + empSalary);
        System.out.println("Gpa : "+empgpa);
        System.out.println("-----------------");
    }
}
