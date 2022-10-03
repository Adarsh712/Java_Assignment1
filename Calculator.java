import java.util.Scanner;

public class Calculator {
    Scanner sc=new Scanner(System.in);

    public void add() {
        System.out.println("Enter two no. for addition :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result = num1+num2;
        System.out.println("Result of addition is : "+result);
    }

    public int subtract(int a, int b){
        return (a-b);
    }

    public int multiply(int a, int b) {
        return (a*b);

    }

    public int divide(int a, int b) {
        return (a/b);

    }

    public int remainder(int a, int b) {
        return (a%b);

    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        //obj.add();
        System.out.println("Enter two numbers :");
        int num1=obj.sc.nextInt();
        int num2=obj.sc.nextInt();
        System.out.println("Subtration of two numbers is : "+obj.subtract(num1,num2));
        System.out.println("Multiplication of two numbers is : "+obj.multiply(num1,num2));
        System.out.println("Division of two numbers is : "+obj.divide(num1,num2));
        System.out.println("Remainder of two numbers is : "+obj.remainder(num1,num2));

    }
}
