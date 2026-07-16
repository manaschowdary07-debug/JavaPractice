import java.util.Scanner;
public class CircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }
}