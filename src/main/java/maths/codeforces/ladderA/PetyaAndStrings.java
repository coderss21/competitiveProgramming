package maths.codeforces.ladderA;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // System.out.println("Enter words");
        String s1= sc.next();
        String s2= sc.next();
        String s1LowerCase = s1.toLowerCase();
        String s2LowerCase=s2.toLowerCase();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println(0);
        }

        else{
            int var=0;
            for(int i= s1.length()-1;i>=0;i--){
                if(s1LowerCase.charAt(i) <s2LowerCase.charAt(i)){
                   var=-1;
                }
                else if(s1LowerCase.charAt(i)>s2LowerCase.charAt(i)){
                    var=1;
                }
            }
            System.out.println(var);
        }

    }
}
