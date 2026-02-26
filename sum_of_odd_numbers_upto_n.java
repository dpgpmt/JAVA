import java.util.*;
public class sum_of_odd_numbers_upto_n{
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the n :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if( i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd number up to "+ n + " is " + sum );

    }
}