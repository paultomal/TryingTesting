package Sassion1;

public class PatanProblem {
    public static void main(String[] args) {
        String a = "geekforgaek";
        String b = "gaek";
        for (int i = 0; i < a.length() + 1 - b.length(); i++) {
            boolean match = true;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println(i);
            }
        }
    }
}