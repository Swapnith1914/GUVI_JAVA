import java.util.Scanner;

class MaxMin_Switch {
    public void MaxMin(int a, int b) {
        if (a > b) {
            System.out.printf("%d is Maximum number", a);

        } else if (b > a) {
            System.out.printf("%d is Maximum number", b);

        } else {
            System.out.println("Wrong input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MaxMin_Switch M = new MaxMin_Switch();
        M.MaxMin(a, b);
    }
}
