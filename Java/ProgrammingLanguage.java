// codechef 1* to 2*

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-- > 0) {
            int[] array = new int[6];
            
            for(int i = 0; i < 6; i++)
                array[i] = sc.nextInt();
            
            int l1 = 0, l2 = 0;
            
            if((array[0] == array[2]) || (array[0] == array[3]))
                l1++;
            if((array[1] == array[2]) || (array[1] == array[3]))
                l1++;
            
            if((array[0] == array[4]) || (array[0] == array[5]))
                l2++;
            if((array[1] == array[4]) || (array[1] == array[5]))
                l2++;
                
            if(l1 == 2)
                System.out.println("1");
            else if (l2 == 2)
                System.out.println("2");
            else
                System.out.println("0");
        }
    }
}

