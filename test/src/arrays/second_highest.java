package arrays;
import java.util.*;

public class second_highest {
    public static void main(String[] args) {
        int[]A={8,9,5,3,2,7,1};
        int n = findsecondhighest(A);
        System.out.println(n);
    }

    public static int findsecondhighest(int[] A)
    {
        int firstlargest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>firstlargest)
            {
                firstlargest=A[i];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>secondlargest&&A[i]<firstlargest)
            {
                secondlargest=A[i];
            }
        }
        return secondlargest;
    }
}
//TC=O(N)
//SC=O(1)