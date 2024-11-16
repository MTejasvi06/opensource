import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int[] br=new int[n];
        for(int i=0;i<n;i++){
            br[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++){
        System.out.print(br[i]+" ");
        }
    }
}
