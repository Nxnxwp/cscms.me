
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        sc.nextLine();
        String b = sc.next();
        long c = sc.nextInt();

        if (b.length() != 1 || !"+-*/%".contains(b)) {
            System.out.println("Error");
            return;
        }

        if ((b.equals("/") || b.equals("%")) && c == 0) {
            System.out.println("Error");
            return;
        }

        switch (b) {
            case "+":
                System.out.println(a + c);
                break;
            case "-":
                System.out.println(a - c);
                break;
            case "*":
                System.out.println(a * c);
                break;
            case "/":
                System.out.println(a / c);
                break;
            case "%":
                System.out.println(a % c);
                break;
            default:
                System.out.println("Error");
        }
    }
}
