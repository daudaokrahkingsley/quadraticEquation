import java.util.Scanner;

public class RootD {

    public static void main(String[] args) {

        Scanner Num = new Scanner(System.in);

        double a;
        System.out.println("Enter a value for a:");
        a = Num.nextDouble();

        double b;
        System.out.println("Enter a value for b:");
        b = Num.nextDouble();

        double c;
        System.out.println("Enter a value for c:");
        c = Num.nextDouble();

        double x1 = (-b + (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / (2 * a);
        double x2 = (-b - (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / (2 * a);

        System.out.print("The root of the quadratic equation is:" + x1 + " or ");

        System.out.print(x2);

    }

}
