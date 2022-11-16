package ss02.exercise;

import java.util.Scanner;

public class CheckPrimeAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        int i = 2;
        boolean check = true;
        if (count < numbers) {
            while (i <= Math.sqrt(N)) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(+N);
                    N++;
                    count++;
            }
        }
    }
}