import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if((x%4==0 && x%100 != 0) || (x%400==0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
