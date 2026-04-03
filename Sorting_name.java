import java.util.*;
public class Sorting_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Sorting input in variable
        int n = 4;
        
        String name[] = new String[n];

        for(int i = 0; i<= n-1; i++){
            System.out.println("Enter the " +i+ " names");
            name[i] = sc.nextLine();
        }

        String  temp;

        for(int i = 0; i<n; i++){
            for(int j= i; j<n; j++){
                //TO compare one string with other strings
                if (name[i].compareTo(name[j])>0){
                    //Swaping 
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }

        //Print output array
        System.out.println(
            "The name in alphabetical Order are: ");
            for(int i = 0; i<n; i++){
                System.out.println(name[i]);
            }
    }
}
