import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(k + "\t");
                k++;
            }
            System.out.println();
            
        }
    }
}
