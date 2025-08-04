import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input sting: ");

        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length() - i; j++) {
                System.out.print(S.charAt(j) + " ");
            }
        }

    }
}
