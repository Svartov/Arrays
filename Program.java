// Connecting libraries
import java.util.Scanner;
import java.util.*;

public class Program {
    public static void main(String[] args) {

            // Connecting keyboard input
            Scanner in = new Scanner(System.in);

            // Requesting the size of the array for further work
            System.out.print("Enter the size of the array: ");
            int size = in.nextInt();

            Integer number[] = new Integer[size]; // Integer is used to sort in reverse order "object"

            // Inserting elements into an array
            for(int i = 0; i < size; i++){
                System.out.print("Enter the number " + i + " : ");
                number[i] = in.nextInt();
            }

            // Printing the elements of an array to the console
            for(int i = 0; i < size; i++) {
                System.out.print(" " +  number[i]);
            }
            System.out.println(); // Indent

           /*
           Create new variables to find the larger and smaller array element
           MaxNum - For the maximum array element
           MinNum - For the minimum array element
            */
           int MaxNum = number[0];
           int MinNum = number[0];

           // Finding the maximum element of an array
           for(int j : number){
               if(j > MaxNum)
                   MaxNum = j;
           }

           // Finding the minimum element of an array
           for(int j : number){
               if(j < MinNum)
                    MinNum = j;
           }

           // Displaying the minimum and maximum values of an array element
           System.out.println("\nMaximum array element: " + MaxNum); // Max
           System.out.println("Minimum array element: " + MinNum); // Min

           // Sorting an array from smallest to largest
           Arrays.sort(number);
           System.out.print("\n" + "Sort from smallest to largest: " + Arrays.toString(number));

           // Sorting an array from largest to smallest
           Arrays.sort(number, Collections.reverseOrder());
           System.out.print("\n" + "Sorting from largest to smallest: " + Arrays.toString(number) );

    }
}
