import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=3 && n<=5){
            System.out.println("Spring");
        }
        else if(n>=6 && n<=8){
            System.out.println("Summer");
        }
        else if(n>=9 && n<=11){
            System.out.println("Autumn");
        }
        else if(n>12 || n==0){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Winter");
        }
    }
}
