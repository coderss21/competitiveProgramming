package maths.codeforces.ladderA;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter no of words");
        int n = sc.nextInt();
        String[] s = new String[n];
        //System.out.println("Write all strings");
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            String s1= s[i];
            int lengthOfString=s1.length();
            if(lengthOfString>10){
                char ch1= s1.charAt(0);
                char ch2 = s1.charAt(lengthOfString-1);
                s[i]=ch1+Integer.toString(lengthOfString-2)+ch2;
            }
            else
                s[i]=s1;
        }
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

}
