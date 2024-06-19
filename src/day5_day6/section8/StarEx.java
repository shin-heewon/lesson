package day5_day6.section8;

import java.util.Scanner;

public class StarEx {

    public static void main(String[] args) {

//        *********
//         *******
//          *****
//           ***
//            *
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<=num/2; i++){
            System.out.print("@");

            for(int j=0; j<=num; j++) {
                System.out.print("*");

            }
        }



    }
}
