import java.util.Scanner;

public class condition {
    static Scanner sc = new Scanner(System.in);

    public static void checkGreaterNumber(){
        System.out.println("Enter two numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else {
            System.out.println(num1+" is less than "+num2);
        }
    }
    public static void checkVote(){
        System.out.println("Enter Age:");
        int age= sc.nextInt();
        if (age>18){
            System.out.println("You can VOTE. ");
        }else {
            System.out.println("You can't VOTE. ");
        }
    }

    public static void monthsCalculator(){
        System.out.println("Enter Days:");
        int num= sc.nextInt();
        int m=num/30;
        int d=num%30;

        System.out.println("You have worked for "+m+" months and "+d+" days.");
    }
    public static void checkRightTriangle(){
        System.out.println("Enter sides of Triangle");
        int num1= sc.nextInt();;
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int a=num1*num1;
        int b=num2*num2;
        int c=num3*num3;
        if (a==(b+c) || b==(a+c) || c==(a+b)){
            System.out.println("It is a RIGHT Triangle.");
        }else {
            System.out.println("Not a RIGHT Triangle. ");
        }
    }
    public static void calculateSalary(){
        System.out.println("Enter Basic :");
        int basic= sc.nextInt();
        float ta= (float) (0.1*basic);
        float da= (float) (0.15*basic);
        float hra= (float) (0.2*basic);
        float pf= (float) (0.12*basic);
        float bonus;
        if (basic>=20000){
            bonus= (float) (.1*basic);
        }else {
            bonus=(float) (.2*basic);
        }
        float salary=basic+da+ta+hra+bonus-pf;
        System.out.println("Your Gross Salary is : "+salary);
    }
    public static void calculateAmount(){
        System.out.println("Enter quantity : ");
        int num1= sc.nextInt();
        System.out.println("Enter Price");
        int num2= sc.nextInt();
        float discount;
        float amount=num1*num2;
        if (num1>10){
            discount= (float) (.1*amount);
        }else {
            discount=0;
        }
        System.out.println("Amount to be paid is "+(amount-discount));
    }
    public static void main(String[] args) {
        checkGreaterNumber();
        checkVote();
        monthsCalculator();
        checkRightTriangle();
        calculateSalary();
        calculateAmount();

    }
}
