import java.util.Scanner;

public class Area {
    static Scanner sc=new Scanner(System.in);
    public static float triangleArea(){
        System.out.println("Provide Altitude and height of Triangle");
        int height=sc.nextInt();
        int altitude=sc.nextInt();
        return (height*altitude/2);
    }
    public static float circleArea(){
        System.out.println("Provide radius of Circle");
        int r= sc.nextInt();
        return (float) (3.14*r*r);
    }
    public static float squareArea(){
        System.out.println("Provide Side of Square");
        int a= sc.nextInt();
        return (float) (a*a);
    }

    public static void main(String[] args) {
        float a=triangleArea();
        float b=circleArea();
        float c=squareArea();

        System.out.println("Area of Triangle is : "+ a);
        System.out.println("Area of Circle is : "+ b);
        System.out.println("Area of Square is : "+ c);
    }
}
