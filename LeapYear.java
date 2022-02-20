import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end values");
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        System.out.println("Leap year Values from " + start + " to " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if ((0 == i % 4) && (0 != i % 100) || (0 == i % 400)) {
                System.out.printf("%d ", i);
            }
        }

    }
}
