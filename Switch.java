import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sunday=0 ,Monday=1 ,Tuesday=3 ,Wednesday=4 Thursday=5 ,Friday=6");
        int DayOfTheWeek = sc.nextInt();
        sc.close();
        switch (DayOfTheWeek) {
            case 0:
                System.out.println("Free Personal Pizza on purchase of medium Pizza");
                break;
            case 1:
                System.out.println("Rs.101 OFF on a bill of Rs.400 and above");
                break;
            case 2:
                System.out.println("Free Plain Garlic Bread on another medium pizza");
                break;
            case 3:
                System.out.println("Buy 1 Get 1 Free on any medium pizza");
                break;
            case 4:
                System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
                break;
            case 5:
                System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
                break;
            case 6:
                System.out.println("Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
                break;
            default:
                System.out.println("Enter Correct Choice");
        }

    }
}
