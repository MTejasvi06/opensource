import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int x=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(n*(x/10));
        }
    }
}
