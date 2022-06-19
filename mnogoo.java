package four.five;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mnogoo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слова ");
        String line = scan.nextLine();
        Pattern pat = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher mat = pat.matcher(line);
        int count = 0;
        while (mat.find()) {
            count++;
            System.out.print(mat.group() + " ");
        }
        System.out.println( "\nКоличество слов кириллицей: "+ count);
    }
}
