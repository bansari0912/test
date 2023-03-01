package FinalExam;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class problem16 {

	public static void main(String[] args) {
        String input = "/* This is a\nmulti-line\ncomment */";
        boolean Comment = Comment(input);
        if (Comment) {
            System.out.println("The input string is a C++ multi-line comment.");
        } else {
            System.out.println("The input string is not a C++ multi-line comment.");
        }
    }

    public static boolean Comment(String input) {
        Pattern pattern = Pattern.compile("/\\*.*\\*/", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}





 

