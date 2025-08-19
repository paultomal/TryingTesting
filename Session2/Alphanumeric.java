package test;

import java.util.Scanner;

public class Alphanumeric {
    public static void checkNum(String name) {
        String alpha = "abcdefgjijklmnopqrstuvwxyz0123456789";
        boolean abc = true;
        if (name.length() >= 6 && name.length() <= 15) {
            for (int j = 0; j < name.length(); j++) {
                boolean validChar = false;
                for (int i = 0; i < alpha.length(); i++) {
                    if (name.charAt(j) == alpha.charAt(i)) {
                        validChar = true;
                        break;
                    }
                }
                if (!validChar) {
                    abc = false;
                    break;
                }
            }
        }else
            abc = false;
        System.out.println(abc);





//        for (int k = 0; k< alpha.length(); k++){
//            char ch = alpha.charAt(k);
//            System.out.println(ch);
//        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        checkNum(name);
    }
}
