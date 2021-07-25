import java.util.Scanner;

public class wapleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        System.out.println("Enter A year to check Leap Year:");
        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println(a + " is a Leap Year");
        } else {
            System.out.println(a + " is not a Leap Year");
        }
    }
}
