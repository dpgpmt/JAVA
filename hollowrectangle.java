import java.util.*;
public class hollowrectangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Enter the Number of column");
        int b = sc.nextInt();

        for (int i= 1; i<=b; i++){
            for( int j = 1; j<=a; j++){
                if (i == 1 || i == b || j == 1 || j == a){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        
    }
}
