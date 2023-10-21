package Programs.LoopMumber;

import java.util.Scanner;

/**
 * loopNumber
 */
public class loopNumber {

    public static void main(String[] args) {
    int multiple, sum = 0, count = 0, average = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the multiple (1-9): ");
    multiple = scan.nextInt();
    for (int i = 1; i <= 50; i++) {
        if (i % multiple == 0) {
            sum += i;
            count++;
            average = sum / count;
        }
    }
    System.out.printf("The number of multiples of %d from 1 to 50 is %d\n", multiple, count);
    System.out.printf("The total of multiples of %d from 1 to 50 is %d\n", multiple, sum);
    System.out.println("The average of multiples of " + multiple + " from 1 to 50 is " + average);
}
}