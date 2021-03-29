package maths.codeforces.ladderA;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter n");
        int n = sc.nextInt();
        //System.out.println("Enter number");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int diff = abs(num[n-1]-num[0]);
        int prev=n-1;
        int curr=0;
        for(int i=1;i<n;i++){
            if(abs(num[i]-num[i-1])<diff){
                diff=abs(num[i]-num[i-1]);
                curr=i;
                prev=i-1;
            }
        }
        System.out.println((prev+1)+" "+(curr+1));
    }
}
