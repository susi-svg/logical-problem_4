import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i % 2 == 0) {
                result += Character.toUpperCase(ch);
            } else {
                result += Character.toLowerCase(ch);
            }
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}