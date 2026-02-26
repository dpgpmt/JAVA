import java.util.*;
public class average {
public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Total Number whoose average you want to find :");
    int n = sc.nextInt();
    int total = 0;
    int average;

    int[] number = new int[n];

    for(int i= 0; i<n; i++){
        System.out.print("Enter the "+ (i +1) +" Number :");
        number[i] = sc.nextInt();
    }

    for(int i = 0; i<n; i++){
        total = total + number[i];
    }
    average = total/n;
    System.out.println("The Average of the above Number is "+ average);
    sc.close();
}   
}
