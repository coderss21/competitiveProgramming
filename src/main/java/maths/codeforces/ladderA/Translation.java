package maths.codeforces.ladderA;


import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String t = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if(sb.toString().equals(t)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
