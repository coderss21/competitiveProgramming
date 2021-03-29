package maths.codeforces.ladderA;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args){
            int totalWeight;
            Scanner sc = new Scanner(System.in);
            totalWeight=sc.nextInt();
            //if(totalWeight>100 && totalWeight<0)
            if(totalWeight%2 ==0 && totalWeight!=2)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

}
