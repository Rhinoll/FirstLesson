package task2;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x == 0 || x % 100 == 11 || (x % 100 >= 10 & x % 100 <= 20)) {
            System.out.println(x + " TOPTOB");
        }
        else if ((x == 1) || (x % 10 == 1 & x != 11)){
            System.out.println(x + " TOPT");
        }
        else if ((x > 1 & x < 5) || (x > 20 & x < 100 & x % 10 > 1 & x % 10 < 5) ||(x > 100 & x % 10 > 1 & x % 10 < 5) ) {
            System.out.println(x + " TOPTA");
        }
        else if (x > 4) {
            System.out.println(x + " TOPTOB");
        }
    }
}
