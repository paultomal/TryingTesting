import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input length: ");
        int N = scanner.nextInt();
        System.out.println("input sting: ");
        String S = scanner.next();
        for(int i = 0; i<N; i++){
            for (int j = 0; j <N-i; j++){
                System.out.print(S.charAt(j) + " ");
            }
        }

    }
}
