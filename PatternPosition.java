import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter the Pattern: ");
        String word = scanner.nextLine();

        Pattern pattern1 = Pattern.compile(word);
        Matcher matcher = pattern1.matcher(sentence);

        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
