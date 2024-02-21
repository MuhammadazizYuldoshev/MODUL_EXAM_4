import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter date regex: ");
        Pattern p=Pattern.compile("(?<day>\\d{2})/(?<month>\\d{2})/(?<year>\\d{4})");

        Matcher matcher=p.matcher(scanner.next());

        if(matcher.matches()){
            System.out.println("Year: "+matcher.group("year"));
            System.out.println("Month: "+matcher.group("month"));
            System.out.println("Day: "+matcher.group("day"));
            System.out.println("Full: "+matcher.group(0));
        }
    }
}
