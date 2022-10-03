import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you married? Enter Y/N");
        char a=sc.next().charAt(0);
        if (a=='Y' || a=='y'){
            System.out.println("You are Insured by the company.");
        }else{
            System.out.println("What is your Gender? Enter M/F");
            char g=sc.next().charAt(0);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if ( g=='F' && age>25) {
                System.out.println("You are Insured by the company.");
            } else if (g=='M' && age>30 ) {
                System.out.println("You are Insured by the company.");
            }
            else {
                System.out.println("You are NOT Insured by the company.");
            }
        }

    }
}
