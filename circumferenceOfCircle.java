import java.util.*;
public class circumferenceOfCircle{

    public static double Circumference (float radius) {
        double Circumference = (2*3.14*radius);

        return Circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle :");
        float radius = sc.nextInt();

        double Circumference = Circumference(radius);
        System.out.println("The Circumference of the circle is :"+ Circumference);


    }
}