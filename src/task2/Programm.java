package task2;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if (x < 1 & y > 0 & (y > 2*x*x || y > 1 -x)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
//Тестируем комиты через гитхаб