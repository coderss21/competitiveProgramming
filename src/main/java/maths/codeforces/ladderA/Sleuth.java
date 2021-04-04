package maths.codeforces.ladderA;

import java.util.Scanner;

public class Sleuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a string");
        String s = sc.nextLine();
        int length = s.length();
        char ch = 0;
        for (int i = length - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ' && s.charAt(i) != '?') {
                ch = s.charAt(i);
                break;
            }
        }
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

